import java.util.Scanner;

public class ReverseNums {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number you want to reverse: ");

        int num = input.nextInt();

        int reverseNumber = 0;

        while (num > 0) {
            int lastDigit = num % 10;

            reverseNumber = reverseNumber * 10 + lastDigit;

            num = num / 10;
        }

        System.out.print("Your reversed number is: " + reverseNumber);

        input.close();
    }
}
