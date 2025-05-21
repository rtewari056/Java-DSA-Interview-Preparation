public class MaxValue {
    public static void main(String[] args) {
        // Maximum value of an array

        int[] arr = { 4, 65, 74, 23, 86 };

        int max = arr[0];
        for (int elem : arr) {
            if (max < elem) {
                max = elem;
            }
        }

        System.out.println("Max value is => " + max);
    }
}
