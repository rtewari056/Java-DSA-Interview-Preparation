import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        // When we dont know the number of arguments we are passing
        fun(1, 2, 5, 6, 8, 9, 15);

        // Order of arguments also should be same
        multiple(5, 9, "Rohit", "Suman");
    }

    static void fun(int ...v) {
        // It will take as array of type integer
        System.out.println(Arrays.toString(v));
    }

    // Variable arguments should always come at end
    static void multiple(int a, int b, String ...val) {
        
    }
}
