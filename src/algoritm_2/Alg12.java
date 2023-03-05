package algoritm_2;

public class Alg12 {
    public static void main(String[] args) {
        for (int i = 0; i < 4; ++i) {
            for (int j = 0; j < 10; ++j) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        for (int i = 0; i < 5; ++i) {
            for (int j = 0; j <= i; ++j) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        for (int i = 0; i < 5; ++i) {
            for (int j = 0; j < 5 - i; ++j) {
                System.out.print("   ");
            }
            for (int k = 0; k <= i; ++k) {
                System.out.print(" * ");
            }
            System.out.println();
        }


        for (int i = 0; i < 5; ++i) {
            for (int j = 0; j < 4 - i; ++j) {
                System.out.print("   ");
            }
            for (int k = 0; k <= 2 * i; ++k) {
                System.out.print(" * ");
            }
            System.out.println();
        }


        for (int i = 0; i < 5; ++i) {
            for (int j = 0; j < 4 - i; ++j) {
                System.out.print("  ");
            }
            for (int k = 0; k <= 2 * i; ++k) {
                System.out.print((i + 1 + " "));
            }
            System.out.println();
        }


        for (int i = 0; i < 5; ++i) {
            for (int j = 0; j < 4 - i; ++j) {
                System.out.print("  ");
            }
            for (int k = i + 1; k > 0; --k) {
                System.out.print(k % 10 + " ");
            }
            for (int m = 2; m <= i + 1; ++m) {
                System.out.print(m % 10 + " ");
            }
            System.out.println();
        }

    }
}
