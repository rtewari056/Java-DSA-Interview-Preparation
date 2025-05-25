public class SearchInRange {
    // Search for 3 in the range of index 1 to 4
    public static void main(String[] args) {
        int[] arr = {18, 7, 78, 3, 43, 9, 94, 32};
        int target = 3;

        boolean isFound = searchInRange(arr, target, 1, 4);
        System.out.println("isFound => " + isFound);
    }

    static boolean searchInRange(int[] arr, int target,int start, int end) {

        if (arr.length == 0) {
            return false;
        }

        for (int index = start; index <= end; index++) {
            if (arr[index] == target) {
                return true;
            }
        }
        return false;
    }
}
