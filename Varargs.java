import java.util.Scanner;
public class Varargs {
      //   static int sum(int a,int b)
      //   {
      //         return a+b;
      //   }
      //   static int sum(int a,int b,int c)
      //   {
      //         return a+b+c;
      //   }
      
        static int sum(int ...arr)
        {
             int result=0;
            for(int a:arr)
            {
                  result+=a;
            }
            return result;
        }
         public static void main(String[] args)
         {
               Scanner sc  =new Scanner(System.in);
               //System.out.println("Welocome");
               System.out.println("The sum of a and b is:"+ sum(1,2));
               System.out.println("The sum of a,b and c is:"+ sum(1,2,3));
               System.out.println("The sum of a,b,c and d is:"+ sum(1,2,3,4));
               
               
         }
}
