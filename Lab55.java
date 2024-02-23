import java.util.Scanner;
class Number{
	Scanner sc = new Scanner(System.in);
	int real;
	int complex;
	int addreal;
	int addcomplex;
	void addnumber(Number n2){
		addreal=real+n2.real;
		addcomplex=complex+n2.complex;
		System.out.println(addreal+"+"+addcomplex+"i");
	}
}
public class Lab55{
	public static void main(String[] args) {
		Number n1 = new Number();
		n1.real=7;
		n1.complex=-3;
		Number n2 = new Number();
		n2.real=32;
		n2.complex=24;
		n1.addnumber(n2);
	}
}