import java.util.Scanner;

public class Atm {

    static void Cash() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Withdraw amount:");
        int wamt = sc.nextInt();

        
    }

     public static double balance()  {
            Cash obj=new Cash();
            double balance = 1000 +obj.wamt;;
            System.out.println(balance);
    
           
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your ID:");
        int id = sc.nextInt();
        System.out.print("Enter password:");
        int pass = sc.nextInt();
        if (id == 102 && pass == 12345) {
            System.out.println("1.Cash withraw\n2.Check balance\n3.Cash Deposit\n4.Exit");
            int fun1 = sc.nextInt();
            if (fun1 == 1) {
                Cash();
                System.out.println("1.Exit\n2.Show Balance");
                int bal = sc.nextInt();
                if (bal == 1) {
                    System.out.println("Thank you for using atm");
                } else if (bal == 2) {
                    double c = balance();
                    System.out.println(c);
                }
            }

        } else
            System.out.println("Enter valid input");

    }
}
