package javaStatements;

public class Exercise9 {
    public static void main(String[] args) {
        int x = 0;
        while (x++ < 10){
            if(x == 8)
                break;
        }
        System.out.println(x);
    }
}
