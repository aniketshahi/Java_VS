import java.util.Scanner;

public class Age {

    public static void main(String[] args) {
        try (Scanner age = new Scanner(System.in)) {
            System.out.print("Enter your age:");
            int ag = age.nextInt();
            if (ag >= 18) {
                System.out.println("You can drive");
            } else
                System.out.println("Ohh boy You cannot drive");
        }

    }
}
