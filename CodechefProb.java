import java.util.Scanner;

public class CodechefProb {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        int T2 = s.nextInt();
        if (T > T2) {
            System.out.println("Second");

        } else if (T < T2) {
            System.out.println("First");
        } else if (T == T2) {
            System.out.println("Any");
        }

        int T3 = s.nextInt();
        int T4 = s.nextInt();

        if (T3 > T4) {
            System.out.println("Second");

        } else if (T3 < T4) {
            System.out.println("First");
        } else if (T3 == T4) {
            System.out.println("Any");
        }

        int T5 = s.nextInt();
        int T6 = s.nextInt();
        if (T5 > T6) {
            System.out.println("Second");

        } else if (T5 < T6) {
            System.out.println("First");
        } else if (T5 == T6) {
            System.out.println("Any");
        }
    }
}
