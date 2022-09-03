import java.util.Scanner;

public class Loop {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Enter number :");
        int num = n.nextInt();
        // While loop
        // while (num <= num) {
        //     System.out.println(num);
        //     num++;
        // }
       
        // For loop
        for(int i=0;i<num;i++)
        {
            System.out.println(i);
        }
    }
}


