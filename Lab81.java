public class Lab81 {
	public static void main(String[] args) {
		int ans;
		try {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			ans = a * b;
			System.out.println(ans);
		}
		catch(Exception e) {
			e.printStackTrace();
		}		
	}
}