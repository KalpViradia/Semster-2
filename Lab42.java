import java.util.Scanner;
public class Lab42{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		int n = str1.length();
		int i = 0;
		int vowels = 0;
		int consonants = 0;
		System.out.println("Enter a string :");
		for(i=0;i<n;i++){
			if(str1.charAt(i)=='a'||str1.charAt(i)=='e'||str1.charAt(i)=='o'||str1.charAt(i)=='u'){
				vowels++;
			}
			else{
				consonants++;
			}
		}
		System.out.println("Number of Vowels are "+vowels);
		System.out.println("Number of Consonants are "+consonants);
	}
}