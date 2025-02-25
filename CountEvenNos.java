
//Sum of even no from 1 to 100
public class CountEvenNos {
    public static void main(String[] args) {
        // Count of Even no from 1 to 100

        int x = 0;

        for (int i = 1; i <= 100; i++) {

            if (i % 2 == 0) {
                x++;

            }
        }
        System.out.println("The count of odd no from 1 to 100: " + x);

    }
}
