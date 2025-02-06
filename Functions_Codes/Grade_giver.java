import java.util.Scanner;

public class Grade_giver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Marks of Student : ");
        float marks = sc.nextFloat();
        grade_giver(marks);
        sc.close();
    }

    static void grade_giver(float marks) {

        if (marks >= 91) {
            System.out.println("Grade : AA");
        } else if (marks >= 81) {
            System.out.println("Grade : AB");
        } else if (marks >= 71) {
            System.out.println("Grade : BB");
        } else if (marks >= 61) {
            System.out.println("Grade : BC");
        } else if (marks >= 51) {
            System.out.println("Grade : CD");
        } else if (marks >= 41) {
            System.out.println("Grade : DD");
        } else {
            System.out.println("No-Grade : Fail!!");
        }
        if (marks > 100) {
            System.out.println("Are you fool!");
        }
    }
}
