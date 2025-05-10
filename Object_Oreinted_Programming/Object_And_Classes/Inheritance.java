
class rectangel{
    int lenght;
    int breadth;
    void setData(int lenght, int breadth){
        this.lenght = lenght;
        this.breadth = breadth;
    }

    void getData(){
        System.out.println("Lenght : " + lenght);
        System.out.println("Breadth : " + breadth);
    }
}

class cuboid extends rectangel{
    int height;
    void setData(int lenght,int height, int breadth){
       super.lenght = lenght;
       super.breadth = breadth;
        this.height = height;
    }
    void getData(){
        System.out.println("Lenght : " + lenght);
        System.out.println("Breadth : " + breadth);
    System.out.println("Height : " + height);
    }
}
class circle{
    float radius;
    float pi = 22/7;
    void setradius(float radius){
        this.radius = radius;
    }

    float area(){
     float area = 2 * pi * radius* radius;
     return area;
    }


}

class cyclinder extends circle{
    
    float height;
    void setheight(float height){
        this.height = height;
    }
    @Override
    void setradius(float radius) {
        super.setradius(radius);
    }
    float perimeter(){
       
        float perimeter = 2* 22/7 * radius * height;
        return perimeter;
    }

}

public class Inheritance{
    public static void main(String[] args) {
    //    circle gola = new circle();
    //    gola.setradius(5);
    //   System.out.println("The Area of Circle is : " +  gola.area()); 
    //    cyclinder cyclic = new cyclinder();
    //    cyclic.setheight(8);
    //    cyclic.setradius(5);
    //    System.out.println("The Perimeter of the derived cyclinder class : " +  cyclic.perimeter());

        rectangel box = new rectangel();
        box.setData(10, 50);
        // box.getData();
        cuboid bigbox = new cuboid();
        bigbox.setData(10,20,30);
        bigbox.getData();
    }
}