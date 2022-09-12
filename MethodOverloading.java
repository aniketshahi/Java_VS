import java.util.Scanner;
public class MethodOverloading {
        static int sum(int a,int b)
        {
            return a+b;

        }
        static int sum(int a,int b,int c)
        {
            return a+b+c;
        }
        static int sum (int a,int b,int c,int d)
        {
            return a+b+c+d;
        }
        
         public static void main(String[] args)
         {
               Scanner sc =new Scanner(System.in);
               System.out.print("Enter Number 1: ");
               int a=sc.nextInt();
               System.out.print("Enter Number 2: ");
               int b=sc.nextInt();
               System.out.print("Enter Number 3: ");
               int c=sc.nextInt();
               System.out.print("Enter Number 4: ");
               int d=sc.nextInt();

               System.out.println(sum(a,b));
               System.out.println(sum(a,b,c));
               System.out.println(sum(a,b,c,d));
               

         }
}
