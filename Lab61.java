import java.util.Scanner;

class student {

    String id_no;
    int no_of_subjects_registered;
    String subject_code;
    int subject_credits;
    double grade_obtained;
    double spi;

    student(String id_no, int no_of_subjects_registered, String subject_Code,
            int subject_credits, double grade_obtained) {

        this.id_no = id_no;
        this.no_of_subjects_registered = no_of_subjects_registered;
        this.subject_code = subject_Code;
        this.subject_credits = subject_credits;
        this.grade_obtained = grade_obtained;
        this.spi = 0.0;

    }

    public void calculateSPI() {
        
    }

    public double getspi() {
        return spi;
    }
}
    public class Lab61 {
        public static void main(String[] args) {
            int n = Integer.parseInt(args[0]);
            student[] a = new student[n];
            Scanner sc=new Scanner(System.in);
            String id_no;
            int no_of_subjects_registered;
            String[] subject_code;
            int[] subject_credits;
            double[] grade_obtained;
            double spi;
            for(int i=0;i<n;i++)
            {
                System.out.println("Enter id number(String) : ");
                id_no=sc.next();
                System.out.println("Enter no_of_subject_registered(Int) : ");
                no_of_subjects_registered=sc.nextInt();
                subject_code=new String[no_of_subjects_registered];
                subject_credits=new int[no_of_subjects_registered];
                grade_obtained=new double[no_of_subjects_registered];
                for(int j=0;j<no_of_subjects_registered;j++)
                {
                    System.out.println("Enter subject_code(String) : ");
                    subject_code[j]=sc.next();
                    System.out.println("Enter subject_credits(Int) : ");
                    subject_credits[j]=sc.nextInt();
                    System.out.println("Enter grade_obtained(double) : ");
                    grade_obtained[j]=sc.nextDouble();
                }
                a[i]=new student(id_no, no_of_subjects_registered, subject_code[i], subject_credits[i], grade_obtained[i]);
                System.out.println(a[i].id_no);
                System.out.print(a[i].no_of_subjects_registered);
                System.out.print(a[i].subject_code);
                System.out.print(a[i].subject_credits);
                System.out.print(a[i].grade_obtained);
            }
        }
    }