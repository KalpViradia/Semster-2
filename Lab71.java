abstract class Vegetables {
    public String name;
    public String color;

    public Vegetables(String name, String color) {
        this.name = name;
        this.color = color;
    }

     public String toString() {
        return ("Name : "  + name + " Color :" + color); 
    }
}

class Potato  extends Vegetables {
    public Potato(String name, String  color) {
        super(name,color);
    }
}

class  Brinjal extends Vegetables {
    public Brinjal(String name, String color) {
        super(name,color);
    }
}

class Tomato extends Vegetables {
    public Tomato(String name, String color) {
        super(name,color);
    }
} 

public class Lab71 {
    public static void main(String[] args) {
        Potato p = new Potato("Potato", "Brown");
        System.out.println(p);

        Brinjal b = new Brinjal("Brinjal", "Purple");
        System.out.println(b);

        Tomato t = new Tomato("Tomato", "Red");
        System.out.println(t);
    }
}