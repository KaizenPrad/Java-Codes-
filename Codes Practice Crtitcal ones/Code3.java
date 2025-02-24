import java.util.Scanner;

public class Code3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = new String();
        System.out.println("Enter the Name : ");
        name = sc.nextLine();
        char String[] = name.toCharArray();
        for (int i = 0; i < String.length; i++) {
            if (Character.isLowerCase(String[i])) {
                String[i] = Character.toUpperCase(String[i]);
                continue;
            }
            if (Character.isUpperCase(String[i])) {
                String[i] = Character.toLowerCase(String[i]);
                continue;
            }

        }
        System.out.println(String);
        sc.close();
    }
}
