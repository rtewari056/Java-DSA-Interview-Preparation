import java.util.Arrays;
import java.util.Scanner;

public class MultiDimention {
    public static void main(String[] args) {
        /*
            1 2 3
            4 5 6
            7 8 9
        */

        /*
         * Note: 
         * 1. Length of the array is required
         * 2. Length of individual element can vary
         */

        // int[][] arr = new int[3][]; 

        int[][] arr1 = { 
            { 1, 2, 3 }, 
            { 4, 5, 6 }, 
            { 7, 8, 9 } 
        };

        int[][] arr2 = { 
            { 1, 2, 3 }, // 0th index
            { 4, 5 }, // 1st index
            { 6, 7, 8, 9 } // 2nd index -> arr2[2] = { 6, 7, 8, 9 }
        };

        // 2D array input
        Scanner inp = new Scanner(System.in);

        int[][] arr2D = new int[3][4]; // Array length -> 3, Length of each element of the 2D array -> 4

        // Taking input for 2D array
        /*
         * Note:
         * 1. Outer for loop is iterating each row
         * 2. Inner for loop is iterating each column
         */
        for (int row = 0; row < arr2D.length; row++) {
            // For each column in every row
            for (int col = 0; col < arr2D[row].length; col++) {
                arr2D[row][col] = inp.nextInt();
            }
        }
        inp.close();

        // Syntax:
        // for (int row = 0; row < size_of_array; row++) {
        //     for (int col = 0; col < size_of_current_row; col++) {
        //         arr2D[row][col] = inp.nextInt();
        //     }
        // }

        // Output 2D array
        // for (int row = 0; row < arr2D.length; row++) {
        //     for (int col = 0; col < arr2D[row].length; col++) {
        //         System.out.print(arr2D[row][col] + " ");
        //     }
        //     System.out.println(); // After printing each row, add a new line
        // }

        // Output 2D array (Enhanced for loop)
        // for (int[] elem : arr2D) {
        //     for (int col = 0; col < elem.length; col++) {
        //         System.out.print(elem[col] + " ");
        //     }
        //     System.out.println(); // After printing each row, add a new line
        // }

        // Output 2D array (Using Arrays.toString() method)
        for (int[] elem : arr2D) {
            System.out.println(Arrays.toString(elem));
        }

    }
}