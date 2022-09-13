import java.util.Scanner;

public class If {

      public static void main(String[] args) {
            try (Scanner number = new Scanner(System.in)) {
                  System.out.print("Enter number 1:");
                  int num_1 = number.nextInt();
                  System.out.print("Enter number 2:");
                  int num_2 = number.nextInt();
                  System.out.print("Enter number 3:");
                  int num_3 = number.nextInt();

                  if (num_1 > num_2 && num_2 > num_3) {
                        System.out.println("Number 1 is greatest");
                  } else if (num_2 > num_3 && num_3 > num_1) {
                        System.out.println("Number 2 is greatest");
                  } else if (num_3 > num_2 && num_2 > num_1) {
                        System.out.println("Number 3 is greatest");
                  }
            }

      }
}