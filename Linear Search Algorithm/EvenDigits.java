public class EvenDigits {
    public static void main(String[] args) {
        // Find numbers with Even Number of Digits
        int[] nums = { 12, 345, 2, 6, 7896 };

        System.out.println("Count => " + findDigitsCount(nums));
    }

    static int findDigitsCount(int[] nums) {
        int count = 0;

        for (int num : nums) {

            int i = 0;

            while (num > 0) {
                num = num / 10;
                i++;
            }

            if (i % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    static int findDigitsCount2(int[] nums) {
        int count = 0;

        for (int num : nums) {

            // For negetive numbers
            if (num < 0) {
                num = num * -1;
            }

            if (((int) (Math.log10(num)) + 1) % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
