import java.util.ArrayList;
import java.util.Scanner;

public class DynamicArrayList {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        /*
         * Note:
         * 1. Size is fixed internally
         * 2. Say arraylist fills by some amount
         * -> It will create a new empty arraylist of double the size
         * -> Old elements are copied in new one
         * -> Old list will be deleted
         */
        ArrayList<Integer> list = new ArrayList<Integer>(5);

        // Add elements
        list.add(12);
        list.add(85);
        list.add(54);
        list.add(74);
        list.add(98);
        list.add(44);

        System.out.println(list);

        // Check if an element exists
        list.contains(54);

        // Remove element from a specific index
        list.remove(4);

        // Set value at any index
        list.set(3, 77); // Set 77 in 3rd index
        System.out.println(list);

        // Take input
        for (int i = 0; i < 5; i++) {
            list.add(inp.nextInt());
        }
        inp.close();

        // Get item at any index
        list.get(2); // Pass index here, list[index] will not work here
    }
}
