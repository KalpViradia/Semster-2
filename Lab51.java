class Circle{
	int radius;
	double area(){
		return 3.14*radius*radius;
	}
}
public class Lab51{
	public static void main(String[] args) {
		Circle c1 = new Circle();
		c1.radius=25;
		System.out.print("Area is "+c1.area());		
	}
}