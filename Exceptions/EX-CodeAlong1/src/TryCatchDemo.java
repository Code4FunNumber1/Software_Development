public class TryCatchDemo {
    public static void main(String[] args) {

        try {
            int a = 10;
            int b = 0;
            int result = a / b;
            System.out.println("Result = %s".formatted(result));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("finally");
        }
    }
}
