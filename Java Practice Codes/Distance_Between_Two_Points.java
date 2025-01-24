import java.util.Scanner; 

public class Distance_Between_Two_Points {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the Two Points");
      System.out.print("X1 , Y1 =");
      double a = sc.nextDouble();
      double b = sc.nextDouble();
      System.out.print("X2 , Y2 =");
      double c = sc.nextDouble();
      double d = sc.nextDouble();

      Distance(a, b, c, d);
      

        
    sc.close();
    }

    static void Distance(double x1,double x2,double y1,double y2){
            double Distance = Math.pow((x1-x2),2)+Math.pow((y1-y2),2);
            System.out.println("The Distance between Two Points : " + Distance);
    }
}
