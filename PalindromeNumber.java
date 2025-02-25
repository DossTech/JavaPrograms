public class PalindromeNumber {

    public static void main(String[] args) {

        int a = 141;
        int original = a;
        int b, c = 0;

        while (a > 0) {

            b = a % 10;
            c = (c * 10) + b;
            a = a / 10;

        }

        if (c == original) {
            System.out.println("The no is Pallindrome");
        } else {

            System.out.println("The no is not Pallindrome");
        }
    }
}