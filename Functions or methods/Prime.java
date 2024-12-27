import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = in.nextInt();

        if (isPrime(num)) {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not a prime number");
        }

        in.close();
    }

    static boolean isPrime(int num) {
        if (num <= 1) return false;
        
        for (int i=2; i<num; i++) {
            if (num % i == 0) return false;
        }

        return true;
    }
}