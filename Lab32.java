import java.util.Scanner;
public class Lab32{
public static void main(String[] args) {
Scanner	sc = new Scanner(System.in);
System.out.println("Enter an integer value");
int a = sc.nextInt();
int b = a;
int rem = 0;
int sum = 0;
while(a!=0){
	rem=a%10;
	sum=sum*10+rem;
	a=a/10;
}
if(sum==b){
	System.out.println("Palindrome");
}
else{
	System.out.println("Not Palindrome");
}
}
}