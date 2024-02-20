import java.util.Scanner;
public class Lab45{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string :");
		String str1 = sc.nextLine();
		int n = str1.length();
		int i = 0;
		for(i=n/2;i<n;i++){
			System.out.println(str1.charAt(i));
			}
		}	
	}