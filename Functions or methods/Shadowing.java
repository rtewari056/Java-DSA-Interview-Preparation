public class Shadowing {
    static int x = 90; // This will be shadowed in line no. 7
    public static void main(String[] args) {
        System.out.println(x); // 90
        
        int x = 40; // Class variable at line no. 2 will be shadowed by this
        System.out.println(x); // 40 --> lower level scope have higher priority

        fun();
    }
    
    static void fun() {
        System.out.println(x); // 90
    }
}
