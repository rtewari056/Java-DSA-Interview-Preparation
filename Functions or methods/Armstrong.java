import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        // Check armstrong number
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter number: ");

        int num = inp.nextInt();

        if (isArmstrong(num)) {
            System.out.println(num + " is a armstrong number");
        } else {
            System.out.println(num + " is not a armstrong number");
        }

        inp.close();
    }

    static boolean isArmstrong(int num) {
        int sum = 0, temp = num;

        while(temp > 0) {
            int lastDigit = temp % 10;
            sum += (lastDigit * lastDigit * lastDigit);
            temp = temp/10;
        }

        return sum == num;
    }
}
