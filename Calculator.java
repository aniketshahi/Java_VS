import java.util.Scanner;

public class Calculator {

    static float add(float a, float b) {
        return a + b;
    }

    static float sub(float a, float b) {
        return a - b;
    }

    static float mul(float a, float b) {
        return a * b;
    }

    static float div(float a, float b) {
        return a / b;
    }

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("1.Addition\n2.Substraction\n3.Multiplication\n4.Division");
            System.out.print("Enter task number: ");
            int c = s.nextInt();
            if (c > 4) {
                System.out.println("Enter valid input");
            } else {
                System.out.print("Enter number 1:");
                float a = s.nextFloat();
                System.out.print("Enter number 2:");
                float b = s.nextFloat();
                if (c == 1) {
                    System.out.print("Sum of 2 numbers are: ");
                    System.out.print(add(a, b));
                } else if (c == 2) {
                    System.out.print("Substraction of 2 numbers are: ");
                    System.out.print(sub(a, b));
                } else if (c == 3) {
                    System.out.print("Multiplication of 2 numbers are: ");
                    System.out.print(mul(a, b));
                } else if (c == 4) {
                    System.out.print("Division of 2 numbers are: ");
                    System.out.print(div(a, b));
                } else
                    System.out.println("Error enter valid input!");

            }
        }
    }

}