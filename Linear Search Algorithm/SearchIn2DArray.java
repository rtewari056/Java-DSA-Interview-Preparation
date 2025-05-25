public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
            {5, 78, 35, 71},
            {25, 85, 34},
            {76, 23, 91, 76},
            {47, -7}
        };

        int target = 99;

        System.out.println("Target exists => " + isTatgetExist(arr, target));
    }

    static boolean isTatgetExist(int [][] arr, int target) {
        if (arr.length == 0) {
            return false;
        }

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (target == arr[row][col]) {
                    return true;
                }
            }
        }

        return false;
    }
}
