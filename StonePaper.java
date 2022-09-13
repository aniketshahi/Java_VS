import java.util.Scanner;
public class StonePaper {
    
        
         public static void main(String[] args)
         {
               try (Scanner sc = new Scanner(System.in)) {
                  System.out.println("Enter value of player 1:");
                     String s=sc.next();
                     System.out.println("Enter value  of player 2:");
                     String sa=sc.next();

                     if (s=="stone" && sa=="paper")
                     {
                            System.out.println("Payer 1 is winner");
                     }
            }


         }
}
