public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        // int[] arr = { -8, -5, 0, 6, 12, 22, 64, 69, 74, 99 };
        int[] arr = { 88, 69, 54, 49, 22, 12, 6, -1, -3 };
        int target = 6;
        System.out.println("Element found at index " + orderAgnosticBinarySearch(arr, target));
    }

    static int orderAgnosticBinarySearch(int[] arr, int target) {
        int startIndex = 0, endIndex = arr.length - 1;

        // Find whether the array is sorted in ascending or descending order
        boolean isAsc = arr[startIndex] < arr[endIndex];

        while (startIndex <= endIndex) {
            // int midIndex = (startIndex + endIndex) / 2; // Might be possible that (start + end) exceeds the range of int in Java
            int midIndex = startIndex + (endIndex - startIndex) / 2;

            if (arr[midIndex] == target) {
                return midIndex;
            }

            if (isAsc) {
                if (target < arr[midIndex]) {
                    endIndex = midIndex - 1; 
                } else {
                    startIndex = midIndex + 1;
                }
            } else {
                if (target > arr[midIndex]) {
                    endIndex = midIndex - 1; 
                } else {
                    startIndex = midIndex + 1;
                }
            }
            
        }
        return -1;
    }
}
