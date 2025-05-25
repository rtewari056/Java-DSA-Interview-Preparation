public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = {12, 45, 56, 34, 98, 35, 85};
        int target = 35;
        boolean ans = linearSearch(nums, target);

        System.out.println("ans => " + ans);
    }

    // Search in the array: Return the index if item found
    // Otherwise if item not found, return true
    static boolean linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return false;
        }

        // Run a for loop
        for (int index = 0; index < arr.length; index++) {
            // Check for element at every index
            int element = arr[index];
            if (element == target) {
                return true;
            }
        }

        // This line will execute if none of the return statements above executed
        // Hence the target not found
        return false;
    }
}