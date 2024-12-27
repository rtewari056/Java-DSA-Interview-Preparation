public class TypeCasting {
    public static void main(String[] args) {

        // Type Casting
        int num = (int) (65.39f);
        System.out.println(num);

        // Auto type promotion in expressions
        int a = 257;
        byte b = (byte) (a);
        System.out.println(b);

        byte x = 50;
        byte y = 40;
        byte z = 20;

        int byteSum = x * y / z; // It will calculate by converting them into integer then assign it
        System.out.println(byteSum);
    }
}
