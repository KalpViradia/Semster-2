import java.util.Scanner; 
public class Lab43{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[4];
		int i = 0;
		int n = 4;
		int sum = 0;
		int avg =0;
		for(i=0;i<n;i++){
			System.out.println("Enter an integer");
			arr[i]=sc.nextInt();
			sum=sum+arr[i];
		}
		avg=sum/4;
		System.out.println("Average is "+avg);
	}
}