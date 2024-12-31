# Problems

## 1. Write a program to print whether a number is even or odd, also take input from the user

```java
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter number => ");
        int num = inp.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " is a even number");
        } else {
            System.out.println(num + " is a odd number");
        }

        inp.close();
    }
}
```

## 2. Take name as input and print a greeting message for that particular name

```java
import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter name => ");
        String name = inp.nextLine();

        System.out.println("Hello " + name.trim());

        inp.close();
    }
}
```

## 3. Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest

```java
import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int printipal, time, rate;

        System.out.print("Enter principal amount => ");
        printipal = inp.nextInt();
        System.out.print("Enter time => ");
        time = inp.nextInt();
        System.out.print("Enter rate => ");
        rate = inp.nextInt();

        int interest = (printipal * time * rate) / 100;

        System.out.println("Your simple interest will be => " + interest);

        inp.close();
    }
}
```

## 4. Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

```java
import java.util.Scanner;

public class OperatorCalculation {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        
        System.out.print("Enter first number => ");
        int num1 = inp.nextInt();

        System.out.print("Enter second number => ");
        int num2 = inp.nextInt();

        System.out.print("Enter operator => ");
        char opr = inp.next().charAt(0);

        if (opr == '+') {
            System.out.println(num1 + num2);
        } else if (opr == '-') {
            System.out.println(num1 - num2);
        } else if (opr == '*') {
            System.out.println(num1 * num2);
        } else if (opr == '/' && num2 != 0) {
            System.out.println(num1 / num2);
        }

        inp.close();
    }
}
```

## 5. Calculate fibonacci Series up to n numbers

```java

```

## 6. Find out whether the given String is Palindrome or not

```java

```

## 7. Find Armstrong Number between two given number

```java

```
