public class Lab81Extra {
	public static void main(String[] args) {
		double c = 1;
		try {
			double a = 10;
			double b = 0;
			c = a / b;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println(c);
		}
	}
}