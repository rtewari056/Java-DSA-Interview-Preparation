import java.util.Arrays;
import java.util.Scanner;

public class ArraysAndArrayList {
    public static void main(String[] args) {
        // Syntax:
        // DataType[] variable_name = new DataType[size]

        // Store 5 roll numbers
        int[] rollNumbers1 = new int[5];

        // Or, directly
        int[] rollNumbers2 = { 23, 15, 48, 57, 87 };

        int[] ros; // Declaration of array. ros is getting defined in the stack.
        ros = new int[5]; // Initialisation: object is being created in the heap memory

        int[] arr = new int[5];

        // Array of primitive data type (Assigning values for each index)
        arr[0] = 48;
        arr[1] = 34;
        arr[2] = 75;
        arr[3] = 23;
        arr[4] = 91;

        Scanner inp = new Scanner(System.in);

        // Input using for loops
        for (int i = 0; i < arr.length; i++) {
            arr[i] = inp.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] + " ");
        // }

        // for (int elem : arr) { // For every element in the array, print the element
        //     System.out.print(elem + " ");
        // }

        // System.out.println(arr[5]); // Index out of bound error

        // Array of objects
        String[] strArr = new String[5];
        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = inp.next();
        }

        // Modify
        strArr[1] = "Rohit";

        System.out.println(Arrays.toString(strArr));

        inp.close();
    }
}