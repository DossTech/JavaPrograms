public class PallindromeNos {
    // 1 to 10000
    public static void main(String[] args) {

        for (int i = 1; i <= 1000; i++) {
            int b, c = 0;
            int original = i;
            int no = i;
            while (no > 0) {
                b = no % 10;
                c = (c * 10) + b;
                no = no / 10;
            }
            if (original == c) {
                System.out.println(c);
            }
        }

    }
}
