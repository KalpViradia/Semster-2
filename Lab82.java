import java.util.Scanner;
public class Lab82 {
    
    public static void main(String[] args) {
       // System.out.println("Hello, World!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of inputs:");
        int n= sc.nextInt();
        System.out.println("================");
        int sum=0;
        int[] a = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            sum=sum+a[i];
        }   
        System.out.println("total sum:"+sum);
        System.out.println("================");
        for(int j=0;j<n;j++){
            try{
                if(a[j]<0){
                    throw new Exception("less then 0 at"+j);
                }
                else if(a[j]%10==0){
                    throw new Exception("divisible by 10 at"+j);
                }
                else if(a[j]>1000 && a[j]<2000){
                    throw new Exception("greater 1000 and less 2000 at"+j);
                }
                else if(a[j]>7000){
                    throw new Exception("gr8tr then 7000 at "+j);
                }
        }catch(Exception e){
            e.printStackTrace();
            sum=sum-a[j];
            System.out.println("sum if non exception:"+sum);
            System.out.print("hi");//throe exception here 
        }
        }
        
        
    }
    
}