public class Sample {
    public static void main(String[] args) {

        int x = 0;

        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0) {

                x = x + i;
            }
        }

        System.out.println("The sum of odd no from 1 to 100: " + x);

    }
}