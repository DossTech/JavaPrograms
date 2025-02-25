import java.util.Scanner;

public class EvenorOdd {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please Enter a no: ");
        int no = s.nextInt();

        if (no % 2 == 0) {
            System.out.println("The no is even");
        } else {
            System.out.println("The no is odd");
        }

    }
}
