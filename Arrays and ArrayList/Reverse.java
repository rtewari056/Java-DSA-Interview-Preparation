import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        // Reverseing an array
        int[] arr = { 54, 91, 72, 63, 55 };

        int startIndex = 0;
        int endIndex = arr.length - 1;

        while (startIndex < endIndex) {
            swap(arr, startIndex, endIndex);
            startIndex++;
            endIndex--;
        }

        System.out.println("Reversed array => " + Arrays.toString(arr));
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
