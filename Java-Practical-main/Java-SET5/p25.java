public class p25 {
    public static void main(String[] args) {
        try {
            throw new Exception("This is a custom exception message");
        } catch (Exception e) {
            System.out.println("Caught an exception: " + e.getMessage());
        } finally {
            System.out.println("This is the finally block, it always executes.");
        }
    }
}
