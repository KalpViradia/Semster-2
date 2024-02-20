import java.util.Scanner;
public class Lab31{
public static void main(String[] args) {
Scanner	sc = new Scanner(System.in);
System.out.println("Enter marks of 5 subjects");
int a = sc.nextInt();
int b = sc.nextInt();
int c = sc.nextInt();
int d = sc.nextInt();
int e = sc.nextInt();
double result=(a+b+c+d+e)/5.0;
if(result>=60){
System.out.println("1st Division");
}
else if(result>=50 && result<=59){
System.out.println("2nd Division");
}
else if(result>=40 && result<=49){
System.out.println("3rd Division");
}
else{
System.out.println("Fail");	
}
}
}