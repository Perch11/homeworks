import java.math.BigInteger;

public class Main {


    private static BigInteger mult(int n){
        int i;
        BigInteger res = BigInteger.ONE;
        for ( i = 10;i<99;i+=2){
            res = res.multiply(BigInteger.valueOf(i));
        }
        return res;
    }


    public static void main(String[] args) {
            int n =100;
        System.out.println(mult(n));

    }
}