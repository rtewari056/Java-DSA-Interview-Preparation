public class Swap {
    public static void main(String[] args) {
        // Swap two numbers
        int a = 10;
        int b = 20;

        System.out.println("Before swap a = " + a + " b = " + b);

        // Swapping will not work as it is passing value only not reference
        swap(a, b);

        System.out.println("After swap a = " + a + " b = " + b);
    }

    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b= temp;
    }
}
