class Time{
	int hour;
	int min;
	int addmin,addhr;
	void addTime(Time t2){
		addhr=hour+t2.hour;
		addmin=min+t2.min;
		if(addmin>60){
			addhr++;
			addmin-=60;
		}
		System.out.println(addhr+":"+addmin);
	}
}
public class Lab52{
	public static void main(String[] args) {
		Time t1 = new Time();
		t1.hour=2;
		t1.min=52;
		Time t2 = new Time();
		t2.hour=6;
		t2.min=46;
		t1.addTime(t2);
	}
}