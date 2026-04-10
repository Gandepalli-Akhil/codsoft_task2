import java.util.Scanner;
interface Payment{
	public void pay(int amount);
	public void checkBalance();	
	public void deposit(int amount);
	public void withdraw(int amount);
}

class CreditCard implements Payment{
	private int balance=20000;

	public void pay(int amount)
	{
	  if(amount>0){
	balance-=amount;
	System.out.println("PAYMENT DONE SUCCESSFULLY");
	}
	else
	System.out.println("INVALID AMOUNT ENTERED");
	}

	public void deposit(int amount){
		if(amount>0){
			balance+=amount;
			System.out.println("DEPOSIT SUCCESSFUL");
		}
		else
			System.out.println("INVALID AMOUNT");
	}

	public void withdraw(int amount){
		if(amount>balance){
			System.out.println("INSUFFICIENT BALANCE");
		}
		else if(amount>0){
			balance-=amount;
			System.out.println("WITHDRAW SUCCESSFUL");
		}
		else
			System.out.println("INVALID AMOUNT");
	}

	public void checkBalance(){
	System.out.println("BALANCE:-"+balance);
	}
}


class DigitalWallet implements Payment{
	private int balance=10000;

	public void pay(int amount)
	{
	  if(amount>0){
	balance-=amount;
	System.out.println("PAYMENT DONE SUCCESSFULLY");
	}
	else
	System.out.println("INVALID AMOUNT ENTERED");
	}

	public void deposit(int amount){
		if(amount>0){
			balance+=amount;
			System.out.println("DEPOSIT SUCCESSFUL");
		}
		else
			System.out.println("INVALID AMOUNT");
	}

	public void withdraw(int amount){
		if(amount>balance){
			System.out.println("INSUFFICIENT BALANCE");
		}
		else if(amount>0){
			balance-=amount;
			System.out.println("WITHDRAW SUCCESSFUL");
		}
		else
			System.out.println("INVALID AMOUNT");
	}

	public void checkBalance(){
	System.out.println("BALANCE:-"+balance);
	}
}	

public class AbstractionPaymentStatus{
	public static void main(String[] args){
		Payment cred=new CreditCard();
		Payment digital=new DigitalWallet();
		Scanner sc=new Scanner(System.in);
		int amount=0;
		while(true){
		System.out.println("1.CREDIT CARD");
		System.out.println("2.DIGITAL WALLET");
		System.out.println("ENTER YOUR CHOICE ");
		int ch=sc.nextInt();
		switch(ch){
		case 1:       
			System.out.println("1.DEPOSIT");
			System.out.println("2.WITHDRAW");
			System.out.println("3.CHECK BALANCE");
			System.out.println("4.EXIT");
			int choice=sc.nextInt();	
			switch(choice){
			case 1: 
				System.out.println("ENTER AMOUNT TO DEPOSIT");
				amount = sc.nextInt();
				cred.deposit(amount);
				break;
			case 2:
				System.out.println("ENTER AMOUNT TO WITHDRAW");
				amount = sc.nextInt();
				cred.withdraw(amount);
				break;
			case 3:
				cred.checkBalance();	
				break;
			case 4:
				System.out.println("THANK YOU");			
				return;
			}
			break;
		case 2:
			  
			System.out.println("1.DEPOSIT");
			System.out.println("2.WITHDRAW");
			System.out.println("3.CHECK BALANCE");
			System.out.println("4.EXIT");
			int option=sc.nextInt();	
			switch(option){
			case 1: 
				System.out.println("ENTER AMOUNT TO DEPOSIT");
				amount = sc.nextInt();
				digital.deposit(amount);
				break;
			case 2:
				System.out.println("ENTER AMOUNT TO WITHDRAW");
				amount = sc.nextInt();
				digital.withdraw(amount);
				break;
			case 3:
				digital.checkBalance();	
				break;
			case 4:
				System.out.println("THANK YOU");			
				return;
			}
			break;
		}
}
}
}