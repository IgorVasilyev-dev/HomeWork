package HomeWork2.loops;

public class MultiplicationTable {

    public static void main(String[] args) {

        int n = 10;
        int l = 10;
        String f = "-----------------------------------------------------------";
        for (int i = 1; i < n + 1; i++) {
            for (int k = 2; k < l; k++) {
                System.out.printf("%2d", k);
                System.out.print(" * ");
                System.out.printf("%2d", i);
                System.out.print(" = ");
                System.out.printf("%2d", (k * i));
                System.out.print(" | ");
                if (k == 5) {
                    System.out.println();
                    break;
                }
            }
        }
        System.out.println(f);
        for (int i = 1; i < n + 1; i++) {
            for (int k = 6; k < l; k++) {
                System.out.printf("%2d", k);
                System.out.print(" * ");
                System.out.printf("%2d", i);
                System.out.print(" = ");
                System.out.printf("%2d", (k * i));
                System.out.print(" | ");
                if (k == 9) {
                    System.out.println();
                    break;
                }
            }
        }
    }
}
