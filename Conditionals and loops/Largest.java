import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        // Q: Find the largest of the 3 numbers

        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();

        int max = x;

        if (y > max) {
            max = y;
        }

        if (z > max) {
            max = z;
        }
        System.out.println("Largest num => " + max);

        input.close();
    }

}
