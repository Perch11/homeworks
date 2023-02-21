package java_operators;

public class ShiftOperators {
    public static void main(String[] args) {
        System.out.println(10<<2);
        System.out.println(-10<<3);
        System.out.println(20>>2);
        System.out.println(15>>3);

        int x = 24,z, y;
        y = 24<<3;             //y = 24 * 8      y = 192
        System.out.println(y);
        z = 24<<4;             // z = 24 * 16    z = 384
        System.out.println(z);


    }
}

