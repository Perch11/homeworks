package homework_2;

import java.util.Scanner;

//Group(floating point number)
public class Homework_2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float j, k, minFloat, maxFloat;
        System.out.print("float j= ");
        j = sc.nextFloat();
        System.out.print("float k= ");
        k = sc.nextFloat();
        System.out.println("float j=" + j);
        System.out.println("float k=" + k);
        minFloat = Float.MIN_VALUE;
        maxFloat = Float.MAX_VALUE;
        System.out.println("minFloat= " + minFloat);
        System.out.println("maxFloat= " + maxFloat);
        System.out.println();


        double l, m, minDouble, maxDouble;
        System.out.print("double l= ");
        l = sc.nextDouble();
        System.out.print("double m= ");
        m = sc.nextDouble();
        System.out.println("double l=" + l);
        System.out.println("double m=" + m);
        minDouble = Double.MIN_VALUE;
        maxDouble = Double.MAX_VALUE;
        System.out.println("minDouble= " + minDouble);
        System.out.println("maxDouble= " + maxDouble);
        System.out.println();


        float f1, f2;
        double d1, d2;
        d1 = 34.567839023;
        d2 = 8923.1234857;
        System.out.println("double d1= " + d1);
        System.out.println("double d2= " + d2);
        f1 = 12.345f;
        f2 = 3456.091f;
        System.out.println("float f1= " + f1);
        System.out.println("float f2= " + f2);

        sc.close();
    }


}
