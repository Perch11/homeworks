package algoritms_1;

import java.util.Scanner;

public class Alg1 {

    boolean foo(int x, int y, int z) {
        int i, j;
        for (i = 0; i <= x; i++) {
            for (j = 0; j <= y; j++) {
                if (i + j * 5 == z) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {

        Alg1 a = new Alg1();
        System.out.println(a.foo(3, 3, 14));
        System.out.println(a.foo(4, 3, 19));

        Scanner ss = new Scanner(System.in);

        int n = ss.nextInt();
        int t = ss.nextInt();
        int r = ss.nextInt();

        if ((n + t * 5 >= r) && (r % 5 <= n)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }


    }
}
