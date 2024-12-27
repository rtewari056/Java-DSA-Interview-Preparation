import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char ch = input.next().charAt(0);

        if (ch >= 'a' && ch <= 'z') {
            System.out.println("Small letter");
        } else {
            System.out.println("Capital letter");
        }

        input.close(); // Close the scanner to release resources
    }
}
