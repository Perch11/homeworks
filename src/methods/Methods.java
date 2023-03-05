package methods;

import java.util.Scanner;

public class Methods {
    static int count = 0;

    /**
     * this method has 2 input parameters
     *
     * @param a type int
     * @param b type int
     * @return int returns 0
     */
    static int method_1(int a, int b) {

        System.out.println(a + b);
        return 0;
    }

    /**
     * This method has not input parameters and returns nothing
     */
    static void method_2() {

        System.out.println("good night");

    }

    /**
     * This method has 1 input parameter
     *
     * @param c boolean type
     */
    static void method_3(boolean c) {
        System.out.println("Hello World1!!");
    }

    /**
     * This method has 1 input parameter
     *
     * @param x type char
     * @return char returns input parameter
     */
    static char method_4(char x) {

        return x;
    }

    /**
     * this method has 2 input parameters
     *
     * @param y type float
     * @param z type float
     * @return float returns one of input parameters
     */
    static float method_5(float y, float z) {

        return z;
    }

    /**
     * This method has not input parameters and returns nothing
     * This method is recursion method
     */
    static void method_6() {
        count++;
        if (count <= 3) {
            System.out.println("recursion");
            System.out.println();

            method_6();
        }
    }


    public static void main(String[] args) {
        char s;
        method_1(5, 6);

        System.out.println();
        method_2();

        System.out.println();
        method_3(true);

        System.out.println();
        s = method_4('d');
        System.out.println(s);
        System.out.println();
        Scanner ss = new Scanner(System.in);

        float e, r;
        System.out.println("nermucel 2 float tver");
        e = ss.nextFloat();
        r = ss.nextFloat();

        float d = method_5(r, e);
        System.out.println(d);
        System.out.println();

        method_6();

    }

}
