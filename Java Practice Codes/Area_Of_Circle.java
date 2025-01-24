import java.util.Scanner;
public class Area_Of_Circle {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the Radius of Circle : ");
            float radius = sc.nextFloat();
            float area = ( (radius * radius ) * 22/7);
            System.out.println("The Area of Circle : " + area);
            sc.close();
                }
    
}
