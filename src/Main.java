import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double Result = 0;
        System.out.print("Enter first operand: ");
        double firstOperand = scanner.nextDouble();

        System.out.print("Enter operator (+, -, *, /, %): ");
        String Operator = scanner.next();

        System.out.print("Enter second operand: ");
        double secondOperand = scanner.nextDouble();
        scanner.close();

        switch (Operator) {
            case "+":
                Result = firstOperand + secondOperand;
                break;
            case "-":
                Result = firstOperand - secondOperand;
                break;
            case "*":
                Result = firstOperand * secondOperand;
                break;
            case "/":
                if (secondOperand == 0) {
                    System.out.println("ERROR: Cannot divide by 0.");
                    System.exit(9);
                }
                Result = (double) firstOperand / secondOperand;
                break;
            case "%":
                Result = firstOperand % secondOperand;
                break;
            default:
                System.out.println("ERROR: Incorrect operator used");
                System.exit(9);
                break;
        }

        System.out.println("Result: " + Result);

    }
}