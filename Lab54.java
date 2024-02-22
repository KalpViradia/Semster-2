import java.util.Scanner;
public class Lab54{
	public static void main(String[] args) {
		Bank b1 = new Bank(56789,200000);
		b1.getaccountDetails();
		b1.printaccountDetails();	
	}
}

class Bank{
	int accountNo;
	int accountbalance;
	Bank(int  accountNo,int accountbalance){
		this.accountNo = accountNo;
		this.accountbalance=accountbalance;
	}

	void getaccountDetails(){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter accountNo:");
		this.accountNo = sc.nextInt();
		System.out.println("enter accountbalance:");
		this.accountbalance = sc.nextInt();
	}


	void printaccountDetails(){
		System.out.println("accountNo: "+this.accountNo);
		System.out.println("accountbalance : "+this.accountbalance);
	}
}
