import java.util.Scanner;

public class Method {

    static int logic(int x, int y) {  //defining method
        int z;
        if (x > y) {
            z = x + y;

        } else {
            z = (x + y) * 5;
        }
        return z;

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number 1:");
        int a=s.nextInt();
        System.out.print("Enter number 2:");
        int b=s.nextInt();
        int c=logic(a,b);  //calling method
        System.out.println(c);
    }
}
