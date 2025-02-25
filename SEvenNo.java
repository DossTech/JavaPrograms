public class SEvenNos {
    public static void main(String[] args) {

        int x = 0;

        for (int i = 1; i <= 100; i++) {

            if (i % 2 == 0) {

                x = x + i;

            }
        }
        System.out.println(x);
    }
}