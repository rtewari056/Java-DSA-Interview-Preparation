public class Overloading {
    public static void main(String[] args) {

        // We can overload funtions based on 2 rules:
        // 1. Either the number of arguments should be different
        // 2. Or the type of arguments should be different 

        // Which function to run will be decided in compile time
        fun(11);
        fun("Rohit");
    }

    static void fun(int a) {
        System.out.println(a);
    }

    static void fun(String name) {
        System.out.println(name);
    }
}
