import java.util.Scanner;
public class Lab24{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double radius, area;
		System.out.println("Enter a radius ");
		radius = sc.nextDouble();
		area = radius*radius*3.14;
		System.out.println("Area is "+area); 
	}
}