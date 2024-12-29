# Problems

## 1. Input a year and find whether it is a leap year or not

```java
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter year => ");
        int year = inp.nextInt();

        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " is a Leap Year");
        } else if (year % 100 == 0 && year % 400 == 0) {
            System.out.println(year + " is a Leap Year");
        } else {
            System.out.println(year + " is not a Leap Year");
        }

        inp.close();
    }
}
```

## 2. Take two numbers and print the sum of both

```java
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter first number => ");
        int num1 = inp.nextInt();
        System.out.print("Enter second number => ");
        int num2 = inp.nextInt();

        System.out.println("Sum is => " + calculateSum(num1, num2));
        
        inp.close();
    }

    static int calculateSum(int num1, int num2) {
        return num1 + num2;
    }
}
```

## 3. Take a number as input and print the multiplication table for it

```java
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter number => ");

        int num = inp.nextInt();

        int count = 1;
        while (count <= 10) {
            int result = num * count;

            System.out.println(num + " X " + count + " = " + result);
            count++;
        }

        inp.close();
    }
}
```
