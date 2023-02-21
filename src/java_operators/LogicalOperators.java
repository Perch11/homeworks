package java_operators;

public class LogicalOperators {
    public static void main(String[] args) {
        int a = 8, b = 3;
        System.out.println(a & b);
        System.out.println(a^b);
        System.out.println(a|b);
        System.out.println(~a);
        System.out.println(true ||(a<4));
        System.out.println((b >= 6)||(++a <= 7));
        System.out.println((a<b)?a:b);
        System.out.println(b^b);

    }
}
