import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // Calculator program

        Scanner inp = new Scanner(System.in);

        while (true) {
            // Take the operator you want to use
            System.out.print("\nEnter the operator: ");

            char opr = inp.next().trim().charAt(0);

            if (opr == '+' || opr == '-' || opr == '*' || opr == '/' || opr == '%') {
                System.out.print("Enter two numbers: ");
                int num1 = inp.nextInt();
                int num2 = inp.nextInt();

                if (opr == '+') {
                    System.out.print("Answer is => " + (num1 + num2));
                } if (opr == '-') {
                    System.out.print("Answer is => " + (num1 - num2));
                } if (opr == '*') {
                    System.out.print("Answer is => " + (num1 * num2));
                } if (opr == '/' && num2 != 0) {
                    System.out.print("Answer is => " + (num1 / num2));
                } if (opr == '%') {
                    System.out.print("Answer is => " + (num1 % num2));
                }
            } else if (opr == 'x' || opr == 'X') {
                inp.close();
                System.out.println("\nBye. Thank you for using my calculator");
                break;
            } else {
                System.out.println("\nInvalid operation. Please try again!");
            }

        }
    }
}
