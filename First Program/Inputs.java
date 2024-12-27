import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter roll number : ");
        int rollNumber = input.nextInt();

        System.out.println("Your roll number is : " + rollNumber);

        input.close();
    }
}
