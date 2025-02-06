import java.util.Scanner;

public class Area_and_Circumference_Cal {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter the Radius of the circle : ");
  float radius = sc.nextFloat();
  System.out.println("The Circumference of the Circle is :  "+ circumference(radius));
  System.out.println("The Area of the Circle is : " + Area(radius));

 
 sc.close();
 }   
 static float circumference(float radius){
    float circum = 2*(22/7)*radius;
    return circum;
 }
 static float Area(float radius){
    float Area = 2*22/7*(radius*radius) ;
    return Area;
 }
}

