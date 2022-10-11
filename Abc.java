import java.util.Scanner;
public class Abc
{

	public static void main (String args[])
 {
	 int balance = 100000, withdraw, deposit;
	 Scanner sc = new Scanner(System.in);
	
	while (true)
		{
			System.out.println("Wlcome to NFSU B.Tech-M.Tech ATM");
			System.out.println("Choose 1 for Withdraw");
			System.out.println("Choose 2 for Deposit");
			System.out.println("Choose 3 for Check Balance");
			System.out.println("Choose 4 for Exit");
			System.out.println("Choose the Operation you want to perform..!!");

			int choice = sc.nextInt();
			switch(choice)
				{
					case 1:
						System.out.print("Enter Money to be Withdrawn: ");
						withdraw = sc.nextInt();
						if(balance >= withdraw)
						{
							balance = balance - withdraw;
							System.out.println("Please Collect your Money💸");
						}
						else
						{
							System.out.println("Insufficient Balance ");
						}
						System.out.println("");
						break;
						
					case 2:
						
						System.out.print("Enter money to be Deposited: ");
						deposit = sc.nextInt();

						balance = balance + deposit;
						System.out.println("Your money has been successfully deposited");
						System.out.println("");
						break;

					case 3:

						System.out.println("Balance  : "+balance);
						System.out.println("");
						break;
					case 4:

				System.exit(0);
			}
		}
  }
}
