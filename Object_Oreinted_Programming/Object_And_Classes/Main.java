import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Student student1 = new Student(1,"Rahul");
        // student1.display();
        // employee e1 = new employee();
        // e1.getSalary(500000);
        // e1.getname("Manthan KeswrWani");
        // e1.setname();
    //    cellphone phone = new cellphone();
    //    System.out.println("Dialing......");
    //    phone.ring();
    //    phone.vibrate();
    //     System.out.println("Call Received!");
        System.out.println("Enter the Side of the square");
        square box = new square();
        int side = sc.nextInt();
        box.getSide(side);
        box.perimeter();
        box.area();
        sc.close();
    }
    }

    class square{
        int side;

        void getSide(int side){
            this.side = side;
        }

        void perimeter(){
            int perimeter = 4*side;
            System.out.println("Perimeter is :"+ perimeter);
        }
        void area(){
            int area = side*side;
            System.out.println("Area is :"+ area);
        }

    }

    class cellphone{
        
        void ring(){
            System.out.println("Ringing.........");
        }
        void vibrate(){
            System.out.println("Vibrating...........");
        }
    }
    class employee{
        int salary;
        String name;

        void getname(String name){
            this.name = name;
        }

        void getSalary(int salary){
            this.salary = salary;
        }
        void setname(){
            System.out.println("Name : " + name);
            System.out.println("Salary : " + salary);
        }
    }



//   class Student{
//         int rollNO;
//         String name;

//         Student(int rollNO,String name){
//             this.rollNO = rollNO;
//             this.name = name;
//         }

//         void display(){
//             System.out.println("Roll NO : " + rollNO );
//             System.out.println("Name : " + name );
//         }


