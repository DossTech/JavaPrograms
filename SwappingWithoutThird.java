public class SwappingWithoutThird {

    public static void main(String[] args) {

        int a = 1;
        int b = 2;
        System.out.println(a);
        System.out.println(b);
        System.out.println("<===========>");
        a = a + b;// 3
        b = a - b;// 1
        a = a - b;// 2
        System.out.println(a);
        System.out.println(b);

    }
}
