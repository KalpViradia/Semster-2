class count {
	static int count = 0;

    public count() {
        count++;
    }
}
public class Lab56{
	public static void main(String[] args) {
		count c1= new count();
		count c2= new count();
		count c3= new count();
		System.out.println(c3.count);
	}
}