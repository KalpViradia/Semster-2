import java.util.Scanner;
public class Lab25{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double fahrenheit,celsius;
		System.out.println("Enter Temperature in fahrenheit");
		fahrenheit = sc.nextDouble();
		celsius = fahrenheit-32*(5/9.0);
		System.out.println("Temperature in celsius is "+celsius); 
	}
}