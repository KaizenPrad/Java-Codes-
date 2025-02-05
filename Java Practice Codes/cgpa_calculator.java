import java.util.Scanner; 
public class cgpa_calculator {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        int mark,sum=0;
        System.out.print("Enter the number of subject you want to enter : ");
        int num = sc.nextInt();
        System.out.println("Enter marks Of each subject as Indexed ");
        System.out.println();
        System.out.println();
        
        for (int i = 1; i <= num; i++) {
        System.out.print("Enter the marks of Subject " + i +" : ");
            mark = sc.nextInt();
            sum += mark;
    }
        float average = (sum/num );
        System.out.print("The CGPA of the student is as follows : "+ average/10 );

    sc.close();
    }
}
