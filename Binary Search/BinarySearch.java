public class BinarySearch {
    public static void main(String[] args) {
        // Find index of element in the array using binary search. If not found, return -1
        int[] arr = { -8, -5, 0, 6, 12, 22, 64, 69, 74, 99 };
        int target = 69;
        System.out.println("Element found at index " + binarySearch(arr, target));
    }

    static int binarySearch(int[] arr, int target) {
        int startIndex = 0, endIndex = arr.length - 1;

        while (startIndex <= endIndex) {
            // int midIndex = (startIndex + endIndex) / 2; // Might be possible that (start + end) exceeds the range of int in Java
            int midIndex = startIndex + (endIndex - startIndex) / 2;
            
            if (target < arr[midIndex]) {
                endIndex = midIndex - 1; 
            } else if (target > arr[midIndex]) {
                startIndex = midIndex + 1;
            } else {
                return midIndex; // Answer
            }
        }
        return -1;
    }
}