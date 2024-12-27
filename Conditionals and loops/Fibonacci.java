import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        // Q: Find the nth fibonacci number

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int a = 0;
        int b = 1;
        int fib = 0;

        int count = 0;
        while(count < n) {
            fib = a + b;
            a = b;
            b = fib;
            count++;
        }

        System.out.println("Fibonacci number at " + n + "th " + "position is = " + fib);

        input.close();
    }
}
