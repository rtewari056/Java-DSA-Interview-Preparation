import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        // Swap values in an array
        int[] arr = { 8, 7, 6, 2, 4 };
        
        // Swaping 1st and 3rd index
        swap(arr, 1, 3);

        System.out.println("After swaping values => " + Arrays.toString(arr));
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
