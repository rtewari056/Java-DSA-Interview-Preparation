import java.util.ArrayList;
import java.util.Scanner;

public class DynamicMultiArrayList {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        // 2D ArrayList
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();

        // Initilization (Required)
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<Integer>());
        }

        // Add elements
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(inp.nextInt());
            }
        }

        System.out.println(list);

        inp.close();
    }
}
