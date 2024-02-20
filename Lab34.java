import java.util.Scanner;
public class Lab34{
public static void main(String[] args) {
Scanner	sc = new Scanner(System.in);
System.out.println("Enter an integer value");
int a = sc.nextInt();
int c = 0;
for(int b=2;b<=a/2;b++){
	if(a%b==0){
		c = 1;
		break;
	}
}
if(c==0){
	System.out.println("Prime Number");
}
else{
	System.out.println("Not Prime Number");
}
}
}