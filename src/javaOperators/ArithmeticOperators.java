package javaOperators;

public class ArithmeticOperators {
    void aritOper(int a,int b){

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a/b);
        System.out.println(a*b);
        System.out.println(a%b);
    }

    void aritOper2(double a,double b){

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a/b);
        System.out.println(a*b);
        System.out.println(a%b);
    }

    public static void main(String[] args) {
        ArithmeticOperators arithmeticOperators =new ArithmeticOperators();
        arithmeticOperators.aritOper(8,6);
        arithmeticOperators.aritOper2(8.596,2.8);
        int x = 2 * ( (5 + 3 ) * 4 - 8);
        int y = 2 * 5 + 3 * 4 - 8;
        System.out.println("x= " + x);
        System.out.println(("y= "+ y));
    }
}
