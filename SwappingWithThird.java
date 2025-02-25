public class SwappingWithThird {

    public static void main(String[] args) {

        int a = 1;
        int b = 2;
        int c;

        System.out.println("Value of a is: " + a);
        System.out.println("Value of b is: " + b);

        c = a;
        a = b;
        b = c;
        System.out.println("Value of a is: " + a);
        System.out.println("Value of b is: " + b);
    }
}
