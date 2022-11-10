import java.util.Scanner;

public class At {
    static double bal = 1000;

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter UserID:");
            int id = sc.nextInt();
            System.out.print("Enter Passward:");
            int pass = sc.nextInt();

            if (id == 102 && pass == 1234) {
                System.out.println("1.Cash Withdraw\n2.Add Money\n3.Show balance\n4.Exit");
                int fun1 = sc.nextInt();
                if (fun1 == 1) {
                    System.out.println("Enter Withdrwal Amount:");
                    Double fun2 = sc.nextDouble();
                    if (fun2 < bal) {
                        System.out.println("Please wait\nPlease collect cash");
                    } else
                        System.out.println("Not enough Balance");
                } else if (fun1 == 2) {
                    System.out.println("Enter amount:");
                    sc.nextDouble();
                    System.out.println("Amount has been added");
                }

                else if (fun1 == 3) {
                    System.out.print("Your Balance is ");
                    System.out.println(bal);
                } else if (fun1 == 4) {
                    System.out.println("Thank you");
                }

            }

            else
                System.out.println("Please enter valid input");
        }
    }
}
