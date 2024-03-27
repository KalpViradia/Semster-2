import java.util.Scanner;
public class Lab83 {
   static int bankbalance = 5000;
    public static void main(String[] args) {
        System.out.println("total balance is : "+bankbalance);
        Scanner sc = new Scanner(System.in);
        System.out.println("enter withdraw amount:");
        int amount=sc.nextInt();
        
        try{
            withdraw(amount);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public static int withdraw(int withdraw) throws Exception{
        if((bankbalance-withdraw)<1000){
            throw new Account("out of bound less than 1000");
        }
        else {
            int newbalance= bankbalance-withdraw;
            System.out.println("balance is : "+newbalance);
        }
        return 0;
    }
}

class Account extends Exception{
    public Account(String s){
        super(s);
    }
}