import java.util.Scanner;
public class Lab63 {
    
    public static void main(String[] args){
        Employee e1 = new Employee();
        System.out.println();
        System.out.println();
        Manager m1 = new Manager();   
    }
}

class Member{
    String name;
    int age;
    long phonenumber;
    String address;
    double salary;
    
     public void details(){
         Scanner sc = new Scanner(System.in);
         System.out.println("enter name");
         name = sc.next();
         
         System.out.println("enter age");
         age = sc.nextInt();
         
         System.out.println("enter phoneno");
         phonenumber = sc.nextLong();
         
         System.out.println("enter address");
         address = sc.next();
         
         System.out.println("enter salary");
         salary = sc.nextDouble();
         
         
     }
    public void printSalary(){
        System.out.println("salary is :"+salary);
    }
    
}

class Employee extends Member{
    String specialization;
    
    Employee(){
        details();
        printdetail();
        printSalary();
    }
    @Override
    public void details(){
         Scanner sc = new Scanner(System.in);
         System.out.println("enter name");
         name = sc.next();
         
         System.out.println("enter age");
         age = sc.nextInt();
         
         System.out.println("enter phoneno");
         phonenumber = sc.nextLong();
         
         System.out.println("enter address");
         address = sc.next();
         
         System.out.println("enter salary");
         salary = sc.nextDouble();
        
         System.out.println("enter Specialization");
         specialization= sc.next();
         
        
     }
    
    public void printdetail(){
        System.out.println(name+" "+age+" "+phonenumber+" "+address);
    }
    public void printSalary(){
        System.out.println("salary is :"+salary);
    }
    
}

class Manager extends Member{
    String depertment;
    
   public Manager(){
        details();
        printdetail();
        printSalary();
    }
    
    @Override
    public void details(){
         Scanner sc = new Scanner(System.in);
         System.out.println("enter name");
         name = sc.next();
         
         System.out.println("enter age");
         age = sc.nextInt();
         
         System.out.println("enter phoneno");
         phonenumber = sc.nextLong();
         
         System.out.println("enter address");
         address = sc.next();
         
         System.out.println("enter salary");
         salary = sc.nextDouble();
        
         System.out.println("enter deratment");
         depertment= sc.next();
     }
    
    public void printdetail(){
        System.out.println(name+" "+age+" "+phonenumber+" "+address);
    }
    public void printSalary(){
        System.out.println("salary is :"+salary);
    }
}