import java.util.Random;
import java.util.Scanner;

 public class P3{
    public static void main(String[] args) {
        
        while (true) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter:\n0 for Rock\n1 for Paper\n2 for Scissor\n");
        System.out.print("Choose:");
        int userInput = sc.nextInt();
        
        Random random = new Random();
        int computerInput = random.nextInt(3);
         // System.out.println("Computer choice: " + computerInput);
        if(computerInput==0){
            System.out.println("Computer choice: Rock");
        }
        else if(computerInput==1){
            System.out.println("Computer choice: Paper");
        }
        else if(computerInput==2){
            System.out.println("Computer choice: Scissors");
        }

        if (userInput == computerInput) {
            System.out.println("It's a Draw");
        }
        else if (userInput == 0 && computerInput == 2 || userInput == 1 && computerInput == 0
                || userInput == 2 && computerInput == 1) {
            System.out.println("Congratulations You Win!");
        } else {
            System.out.println("Oops! Computer Win!");
        }
       
        
    }
}

}