import java.util.Scanner;
public class Code1 {
    public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
      System.out.println("Enter the Name : ");
      String name = sc.nextLine();
      String temp = name.toUpperCase();

      System.out.println("============================");
      System.out.println("Character          Frequency");
      System.out.println("============================");
    for (char index = 'A'; index <= 'Z'; index++) {
        int count = 0;
        for (int i = 0; i < temp.length(); i++) {
           if (index==temp.charAt(i)) {
                count++;
           }
        }
        if (count !=0) {
            System.out.println("   " + index + "                  " + count );
        }
    }
     
   sc.close();
      }
 }
