package javaOperators;

public class UnaryOperators {
    void unOperator(int e, int f, boolean n1){
        System.out.println("1) -e = " + -e);
        System.out.println("2) -f = " + -f);
       // System.out.println("3) +e = "+ +e);
        System.out.println("4) -e + 92 = "+ (-e + 92));
        System.out.println("5)  !n1 = "+ !n1);
        System.out.println("6)!(!n1) = "+ !(!n1));
        System.out.println("7) e++ = "+ (e++));
        System.out.println("8)--f = "+ --f);


    }
    public static void main(String[] args) {
        int e = 10, f = -88;
        boolean n1 = true;
        UnaryOperators unaryOperators = new UnaryOperators();
        unaryOperators.unOperator(e,f,n1);
        int x = 3;
        int y = ++x * 5 / x-- + --x;
        System.out.println("x = " + x);
        System.out.println("y = " + y);

    }
}
