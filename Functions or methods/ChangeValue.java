import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        int[] arr = {1, 5, 9, 12, 16};
        change(arr); // The value which is passed refers to same object
        System.out.println("arr = " + Arrays.toString(arr));
    }

    static void change(int[] myArr) {
        // If you make a change to the object via this reference variable, same object will be change
        myArr[0] = 99;
    }
}
