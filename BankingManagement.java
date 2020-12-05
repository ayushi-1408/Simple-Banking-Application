package projects;

import java.util.Scanner;

public class BankingManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your name and id");
		String a=sc.nextLine();
		String b=sc.nextLine();
		BankAccount obj1= new BankAccount(a,b);
		obj1.ShowMenu();
	}

}
class BankAccount{
	int balance;
	int prev_transaction;
	String CustomerName;
	String CustomerId;
	
	BankAccount(String name, String id){
		CustomerName= name;
		CustomerId= id;
	}

void withdrawl(int amount) {
	if(amount !=0) {
		balance= balance- amount;
		prev_transaction= -amount;
	}
}
void deposit(int amount) {
	if(amount !=0) {
		balance= balance+amount;
		prev_transaction= amount;
	}
}

void getPreviousTransaction() {
	if(prev_transaction>0) {
		System.out.println("Deposited " +prev_transaction);
	}
	else if(prev_transaction<0) {
		System.out.println("Withdrawn "+ Math.abs(prev_transaction));
	}
	else {
		System.out.println("No transaction occured");
	}
}
void ShowMenu() {
	Scanner sc= new Scanner(System.in);
	char option='\0';
	System.out.println("Welcome " +CustomerName);
	System.out.println();
	System.out.println("A. Check Balance");
	System.out.println("B. Deposit");
	System.out.println("C. Withdrawl");
	System.out.println("D. Prev_transaction");
	System.out.println("E. Exit");
	
	while (option !='E' ) {
		System.out.println("=============");
		System.out.println("Enter the option");
		option = sc.next().charAt(0); 
		System.out.println("=============");  
		System.out.println();
		
		switch(option) {
		case 'A' :
			System.out.println("***********");
			System.out.println("Balance= "+balance);
			System.out.println("***********");
			break;
			
		case 'B': 
			System.out.println("***********");
			System.out.println("Enter the amount to be deposited");
			int amount= sc.nextInt();
			deposit(amount);
			System.out.println();
			
			System.out.println("***********");
			break;
		case 'C':
			System.out.println("***********");
			System.out.println("Enter the amount to be withdrawn");
			int amount1=sc.nextInt();
			withdrawl(amount1);
			System.out.println("***********");
			break;
		case 'D':
			System.out.println("***********");
			getPreviousTransaction();
			System.out.println("***********");
			break;
			
			default:
				System.out.println("** Invalid option **");
				break;
		}
		
		
	}
	if(option== 'E') {
		System.out.println("Exit from bank");
	}
	System.out.println("** THANKYOU **");
	
	
}



}