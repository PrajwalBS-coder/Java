import java.util.Scanner;

class bank{
	String cust_name;
	int acc_no;
	float balance;
	bank(){	}
	bank(String cust_name, int acc_no, float balance){
		this.cust_name = cust_name;
		this.acc_no = acc_no;
		this.balance = balance;
	}
	void create_acc(){
		Scanner in = new Scanner(System.in);
		System.out.println();
		System.out.print("Enter the customer name : ");
		cust_name = in.next();
		System.out.print("Enter the account number : ");
		acc_no = in.nextInt();
		System.out.print("Enter the balance : ");
		balance = in.nextFloat();
	}
	void deposit( float amt){
		balance += amt; 
		System.out.println("After deposit of "+amt+" balance is : "+balance);
	}
	void withdraw(double amt){
		balance -= amt;
		System.out.println("After withdrawal of "+amt+" balance is : "+balance);
	}
	void display(){
		System.out.println();
		System.out.println("Customer Name  : "+cust_name);
		System.out.println("Account Number : "+acc_no);
		System.out.println("Balance		: "+balance);
	}
}
class main {

	public static void main(String[] args) {
		
		bank b = new bank("abc",11223344,50000.5f);
		bank b1 = new bank();
		b.display();
		b.deposit(500f);
		b.withdraw(1000);
		
		b1.create_acc();
		b1.display();
		b1.withdraw(1500);
		b1.deposit(2500f);
	}

}