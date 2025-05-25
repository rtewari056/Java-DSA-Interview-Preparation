public class FindMinAndMax {
    public static void main(String[] args) {
        int[] arr = {18, 7, 78, 3, 43, 9, 94, 32, -7};

        System.out.println("Min number => " + getMinNum(arr));
        System.out.println("Max number => " + getMaxNum(arr));
    }

    static int getMinNum(int[] arr) {
        int min = arr[0];

        for (int index = 1; index < arr.length; index++) {
            if (arr[index] < min) {
                min = arr[index];
            }
        }

        return min;
    }

    static int getMaxNum(int[] arr) {
        int max = arr[0];

        for (int index = 1; index < arr.length; index++) {
            if (arr[index] > max) {
                max = arr[index];
            }
        }

        return max;
    }
}
