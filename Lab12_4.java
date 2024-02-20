import java.util.Scanner;
public class Lab12_4{
	public static void main(String[] args){
		int[] arr = {1,2,5,8,15,28,35,48,55,61};
		int high = arr.length-1;
		int low = 0;
		int mid = (high+low) / 2;
		System.out.println("Enter number to search : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean isFound=false;
		while(high>=low){
			if(n<arr[mid]){
				high = mid-1;
			}
			else if(n==arr[mid]){
				isFound=true;
				System.out.println("Found the number : "+n);
				break;
			}
			else{
				low = mid-1;
			}
			mid = (high + low) / 2;
		}
		if(!isFound){
			System.out.println("Not found"w);
		}
	}
}
