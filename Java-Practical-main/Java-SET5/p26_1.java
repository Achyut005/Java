
class MyCustomException extends Exception {
    public MyCustomException(String message) {
        super(message);
    }
}

public class p26_1 {
    public static void validate(int age) throws MyCustomException {
        if (age < 18) {
            throw new MyCustomException("Age is less than 18");
        } else {
            System.out.println("Age is valid");
        }
    }

    public static void main(String[] args) {
        try {
            validate(15);
        } catch (MyCustomException e) {
            System.out.println("Caught the exception: " + e.getMessage());
        }
    }
}
