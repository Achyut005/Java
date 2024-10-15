import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class BankingApplication {
    private static List<Account> accounts = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean exit = false;
        while (!exit) {
            System.out.println("=== Banking Application ===");
            System.out.println("1. Create an account");
            System.out.println("2. Deposit money");
            System.out.println("3. Withdraw money");
            System.out.println("4. Check Balance");
            System.out.println("5. Transfer Funds");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();    // Fetching choice

            switch (choice) {
                case 1:
                    createAccount(scanner);
                    break;
                case 2:
                    depositMoney(scanner);
                    break;
                case 3:
                    withdrawMoney(scanner);
                    break;
                case 4:
                    checkBalance(scanner);
                    break;
                case 5:
                    transferFunds(scanner);
                    break;
                case 6:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            System.out.println();
        }

        scanner.close();
    }

    private static void createAccount(Scanner scanner) {
        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();

        System.out.print("Enter account holder name: ");
        String accountHolderName = scanner.nextLine();

        System.out.print("Enter initial balance: ");
        double balance = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline character

        Account account = new Account(accountNumber, accountHolderName, balance);
        accounts.add(account);

        System.out.println("\nAccount created successfully. Data saved in Database.dat file.");

        try (FileOutputStream writer = new FileOutputStream("C:\\Users\\Admin\\OneDrive\\Desktop\\Java MP\\Database.dat", true)) {
            String accDetails = "\nAccount no: " + accountNumber + "\n";
            String accDetails2 = "Account Holder: " + accountHolderName + "\n";
            String accDetails3 = "Account Balance: " + balance + "\n";
            byte[] message = accDetails.getBytes();
            byte[] message2 = accDetails2.getBytes();
            byte[] message3 = accDetails3.getBytes();
            writer.write(message);
            writer.write(message2);
            writer.write(message3);
            writer.write("- - - - - - - - - -".getBytes());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void depositMoney(Scanner scanner) {
        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();

        Account account = findAccount(accountNumber);
        if (account != null) {
            System.out.print("Enter amount to deposit: ");
            double amount = scanner.nextDouble();
            scanner.nextLine(); // Consume the newline character

            account.deposit(amount);

            addTransaction(account, "Deposit", amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    private static void withdrawMoney(Scanner scanner) {
        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();

        Account account = findAccount(accountNumber);
        if (account != null) {
            System.out.print("Enter amount to withdraw: ");
            double amount = scanner.nextDouble();
            scanner.nextLine(); // Consume the newline character

            try {
                account.withdraw(amount);

                addTransaction(account, "Withdrawal", -amount);
            } catch (InsufficientBalanceException e) {
                System.out.println("Withdrawal failed: " + e.getMessage());
            }
        } else {
            System.out.println("Account not found.");
        }
    }

    private static void checkBalance(Scanner scanner) {
        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();

        Account account = findAccount(accountNumber);
        if (account != null) {
            System.out.println("Account balance: " + account.getBalance());
        } else {
            System.out.println("Account not found.");
        }
    }

    private static void transferFunds(Scanner scanner) {
        System.out.print("Enter sender's account number: ");
        String senderAccountNumber = scanner.nextLine();

        System.out.print("Enter receiver's account number: ");
        String receiverAccountNumber = scanner.nextLine();

        Account senderAccount = findAccount(senderAccountNumber);
        Account receiverAccount = findAccount(receiverAccountNumber);

        if (senderAccount != null && receiverAccount != null) {
            System.out.print("Enter amount to transfer: ");
            double amount = scanner.nextDouble();
            scanner.nextLine(); // Consume the newline character

            try {
                senderAccount.withdraw(amount);
                receiverAccount.deposit(amount);

                addTransaction(senderAccount, "Transfer to " + receiverAccountNumber, -amount);
                addTransaction(receiverAccount, "Transfer from " + senderAccountNumber, amount);

                System.out.println("Transfer successful.");
            } catch (InsufficientBalanceException e) {
                System.out.println("Transfer failed: " + e.getMessage());
            }
        } else {
            System.out.println("One or both accounts not found.");
        }
    }

    private static void addTransaction(Account account, String type, double amount) {
        Transaction transaction = new Transaction(type, amount);
        account.addTransaction(transaction);
    }

    private static Account findAccount(String accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }
}

class Account {
    private String accountNumber;
    private String accountHolderName;
    private double balance;
    private List<Transaction> transactionHistory;

    public Account(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.transactionHistory = new ArrayList<>();
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("\nDeposit successfully completed. Current balance: " + balance);
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance. Current balance: " + balance);
        }
        balance -= amount;
        System.out.println("Withdrawal successful. Current balance: " + balance);
    }

    public List<Transaction> getTransactionHistory() {
        return transactionHistory;
    }

    public void addTransaction(Transaction transaction) {
        transactionHistory.add(transaction);
    }
}

class Transaction {
    private String type;
    private double amount;

    public Transaction(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }


    
}
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}