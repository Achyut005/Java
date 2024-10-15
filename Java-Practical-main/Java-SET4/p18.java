class Member {
    String name;
    int age;
    String phoneNumber;
    String address;
    double salary;
  
    Member(String name, int age, String phoneNumber, String address, double salary) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
    }
  
    void printSalary() {
        System.out.println("Salary of " + name + ": " + salary);
    }
  }
  
  class Employee extends Member {
    String specialization;
  
    Employee(String name, int age, String phoneNumber, String address, double salary, String specialization) {
        super(name, age, phoneNumber, address, salary);
        this.specialization = specialization;
    }
  }
  
  class Manager extends Member {
    String department;
  
    Manager(String name, int age, String phoneNumber, String address, double salary, String department) {
        super(name, age, phoneNumber, address, salary);
        this.department = department;
    }
  }
  
  public class p18 {
    public static void main(String[] args) {
        Employee employee = new Employee("John", 30, "123-456-7890", "123 Main St", 50000.0, "Software Development");
        employee.printSalary();
        System.out.println("Specialization: " + employee.specialization);
  
        Manager manager = new Manager(" Smith", 40, "987-654-3210", "456 Park Ave", 80000.0, "Operations");
        manager.printSalary();
        System.out.println("Department: " + manager.department);
    }
  }
  