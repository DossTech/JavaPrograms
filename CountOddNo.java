public class CountOddNo {

    public static void main(String[] args) {
        int x = 0;

        for (int i = 1; i <= 100; i++) {

            if (i % 2 != 0) {
                x++;

            }
        }
        System.out.println("The count of odd no from 1 to 100: " + x);

    }
}
