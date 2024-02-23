public class Lab57 {
	public static void main(String[] args) {
		demo a=new demo();
		a.check();
	}
}

class demo{
	static int a=0;
	String s="yes";

	demo(){
		a++;
	}

	void check(){
		System.out.println(this.a+":"+this.s);
	}


}