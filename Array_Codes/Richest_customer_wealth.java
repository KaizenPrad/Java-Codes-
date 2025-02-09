import java.util.Scanner; 
public class Richest_customer_wealth {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
    int[] arr1 = {1,7};
    int[] arr2 = {1,5};
    int[] arr3 = {1,8};
    int acc1=0,acc2=0,acc3=0;
    for (int i = 0; i < arr1.length; i++) {
        acc1+= arr1[i];
    }
    for (int i = 0; i < arr2.length; i++) {
        acc2+= arr2[i];
    }
    for (int i = 0; i < arr3.length; i++) {
        acc3+= arr3[i];
    }
    System.out.println("Person 1 Wealth = "+ acc1 + "\n"+ "Person 2 Wealth = " + acc2 + "\n"+"Person 3 Wealth = " + acc3);
    if(acc1>acc2 && acc1> acc3){
        System.out.println("The richest Account is Of the Person 1 With wealth = " + acc1);
    }
    else if (acc2>acc1 && acc2>acc3) {
        System.out.println("The richest Account is Of the Person 2 With wealth = " + acc2);
    }
    else if (acc3>acc1 && acc3>acc2) {
        System.out.println("The richest Account is Of the Person 3 With wealth = " + acc3);
    }
    else if (acc1==acc2 && acc1==acc3 && acc2==acc3) {
        System.out.println("All Parties are Richer having the same Wealth = " + acc1);
    }
    else{
        System.out.println("Invalid input");
    }

    sc.close();
    }
}
