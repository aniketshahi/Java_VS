import java.util.Scanner;

public class Atm {

    static double Cash() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Withdraw amount:");
        double wamt = sc.nextDouble();

        return wamt;

    }

    public static double bal(double wamt) {
        return wamt;
    }

    public static double balance(double wamt) {

        double balance = 1000 + wamt;
        System.out.print(balance);
        return balance;

    }

    public static void checkwithraw(double wamt, double balance) {
        if (balance > wamt) {
            System.out.println("Please wait for cash\n Please collect cash\n Thank you");

        } else
            System.out.println("Not Enough Money");
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
                bal();
                checkwithraw(Cash(), balance());
                System.out.println("1.Exit\n2.Show Balance");
                int bal = sc.nextInt();
                if (bal == 1) {
                    System.out.println("Thank you for using atm");
                } else if (bal == 2) {
                    double c = balance(bal);
                    System.out.println(c);
                }
            }

        } else
            System.out.println("Enter valid input");

    }
}
