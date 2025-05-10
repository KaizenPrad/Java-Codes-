
import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Following :-");
        System.out.print("Radius : ");
        float radius = sc.nextFloat();
        System.out.print("Height : ");
        float height = sc.nextFloat();

        cylinder box = new cylinder();
        box.setData(radius,height);
        float surfaceArea = box.surfaceArea();
        float volume = box.volume();
        System.out.println("Surface Area : " + surfaceArea + "\n" + "Volume : " + volume );
        sc.close();
    }
}

class cylinder{
    float radius;
    float height;
    float pi = 22/7;
    void setData(float radius,float height){
        this.radius=radius;
        this.height= height;
    }
    float surfaceArea(){
        float surfaceArea = 2*pi+radius*height + 2*pi*radius*radius;
        return surfaceArea;
    }
    float volume(){
        float volume = pi*radius*radius*height;
        return volume;
    }
}
