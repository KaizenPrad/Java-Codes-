public class stuff {
    public static void main(String[] args) {
        int a=10;
        int b=19;
        System.out.println(a + "" +b);
        a=a+b-(b=a);
        System.out.println(a + "" + b);
    }
}
