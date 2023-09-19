import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number1, number2, result;
        char operator;

        System.out.print("Enter the first number: ");
        number1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        number2 = scanner.nextDouble();

        System.out.print("Choose an operation (+, -, *, /): ");
        operator = scanner.next().charAt(0);

        switch (operator) {
            case '+':
                result = number1 + number2;
                System.out.println("Result: " + result);
                break;
            case '-':
                result = number1 - number2;
                System.out.println("Result: " + result);
                break;
            case '*':
                result = number1 * number2;
                System.out.println("Result: " + result);
                break;
            case '/':
                if (number2 != 0) {
                    result = number1 / number2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Division by zero error!");
                }
                break;
            default:
                System.out.println("Invalid operation choice.");
        }

        scanner.close();
    }
}
