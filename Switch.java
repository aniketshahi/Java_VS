import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
        try (Scanner age = new Scanner(System.in)) {
            System.out.print("Enter your age:");
            int a = age.nextInt();
            switch (a) {
                case 18:
                    System.out.println("You are 18.Enjoy you next days");
                    break;
                case 21:
                    System.out.println("You're an adult .Behave resposibily");
                    break;
                case 35:
                    System.out.println("You are very much resposible");
                    break;
                default:
                    System.out.println("Enjoy your day ");

            }
        }
    }
}
