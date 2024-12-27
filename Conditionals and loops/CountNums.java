import java.util.Scanner;

public class CountNums {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int number = input.nextInt();

        System.out.println("The occurance which you want to find: ");
        int occ = input.nextInt();

        int n = number;
        int count = 0;

        while (n > 0) {
            int rem = n % 10;

            if (occ == rem) {
                count++;
            }

            n = n / 10;
        }

        System.out.println(occ + " is present " + count + " times");

        input.close();
    }
}
