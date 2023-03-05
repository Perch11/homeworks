package homework_1;

import java.util.Scanner;

//Group(Integer)
public class Homework_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        byte a, b, minByte, maxByte;
        System.out.print("byte a= ");
        a = sc.nextByte();
        System.out.print("byte b= ");
        b = sc.nextByte();
        System.out.println("byte a=" + a);
        System.out.println("byte b=" + b);
        minByte = Byte.MIN_VALUE;
        maxByte = Byte.MAX_VALUE;
        System.out.println("minByte= " + minByte);
        System.out.println("maxByte= " + maxByte);
        System.out.println();


        short c, d, minShort, maxShort;
        System.out.print("short c= ");
        c = sc.nextShort();
        System.out.print("short d= ");
        d = sc.nextShort();
        System.out.println("short c=" + c);
        System.out.println("short d=" + d);
        minShort = Short.MIN_VALUE;
        maxShort = Short.MAX_VALUE;
        System.out.println("minShort= " + minShort);
        System.out.println("maxShort= " + maxShort);
        System.out.println();


        int e, f, minInt, maxInt;
        System.out.print("int e= ");
        e = sc.nextInt();
        System.out.print("int f= ");
        f = sc.nextInt();
        System.out.println("int e=" + e);
        System.out.println("int f=" + f);
        minInt = Integer.MIN_VALUE;
        maxInt = Integer.MAX_VALUE;
        System.out.println("minInt= " + minInt);
        System.out.println("maxInt= " + maxInt);
        System.out.println();

        long g, h, minLong, maxLong;
        System.out.print("long g= ");
        g = sc.nextLong();
        System.out.print("long h= ");
        h = sc.nextLong();
        System.out.println("long g=" + g);
        System.out.println("long h=" + h);
        minLong = Long.MIN_VALUE;
        maxLong = Long.MAX_VALUE;
        System.out.println("minLong= " + minLong);
        System.out.println("maxLong= " + maxLong);
        System.out.println();


        sc.close();
    }
}
