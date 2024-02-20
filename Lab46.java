public class Lab46{
	public static void main(String[] args) {
		String s = args[0];
		System.out.println(s);
		if(s.charAt(0)>='A' && s.charAt(0)<='Z'){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
	}
}