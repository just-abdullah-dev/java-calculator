import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Calculator (Lab 3)");
        Scanner sc = new Scanner(System.in);
        System.out.println("Operations: \n" +
                "1. Addition\n" +
                "2. Subtraction\n" +
                "3. Multiplication\n" +
                "4. Division\n"+
                "5. Modulus\n" +
                "6. Exponential\n");
        System.out.println("Which operation");
        int op = sc.nextInt();
        System.out.println("Enter the first number: ");
        double a = sc.nextDouble();
        System.out.println("Enter the second number: ");
        double b = sc.nextDouble();

        switch (op) {
            case 1:
                System.out.println("Addition of " + (a) + " + " + (b) + " = " + (a + b));
                break;
            case 2:
                System.out.println("Subtraction of " + (a) + " - " + (b) + " = " + (a - b));
                break;
            case 3:
                System.out.println("Multiplication of " + (a) + " * " + (b) + " = " + (a * b));
                break;
            case 4:
                System.out.println("Division of " + (a) + " / " + (b) + " = " + (a / b));
                break;
            case 5:
                System.out.println("Modulus of " + (a) + " % " + (b) + " = " + (a % b));
                break;
            case 6:
                System.out.println("Exponential of " + (a) + " ^ " + (b) + " = " + Math.pow(a, b));
                break;
            default:
                System.out.println("Invalid input");
        }
    }
}
