package algoritm_2;

import java.util.Scanner;

public class Alg8 {
    public static void main(String[] args) {
        for (int i = 1; i <= 500; i++) {
            int sum = 0;

            int n = i;

            while (n != 0) {
                int x = n % 10;
                sum += x * x * x;
                n = n / 10;

            }
            if (sum == i){
                System.out.println(sum +" is armstrong number");
            }
//            else{
//              //  System.out.println(sum + "is not armstrong number ");
//            }
        }
    }
}
