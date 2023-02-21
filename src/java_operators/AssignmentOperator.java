package java_operators;

public class AssignmentOperator {
    public static void main(String[] args) {
        int x;
        System.out.println("x = " + (x = (int)1.0));
        short y = (short) 1921222;
        System.out.println("y = " + y);
        System.out.println(2147483647 + 1);
       // long y = (x = 3);             qani vor y arden haytararvac a short chenq kara poxenq long
        System.out.println("y = " + y);
       // boolean x = (y = true);       nuynnel x - i depqum
        System.out.println(x);        //ete popoxakanneri anunner@ poxenq u type tanq iranc normal kashxati


    }
}
