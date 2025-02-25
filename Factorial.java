import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        System.out.println("Enter a no: ");
        Scanner s = new Scanner(System.in);
        int no = s.nextInt();

        int no1 = 1;
        for (int i = no; i > 0; i--) {

            no1 = no1 * i;

        }

        System.out.println("The Factorial of the no : " + no1);
    }
}
