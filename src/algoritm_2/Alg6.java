package algoritm_2;

import java.util.Scanner;

public class Alg6 {

    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        int countNeg = 0, countZero = 0,countPositive = 0;
        System.out.println("Enter numbers: ");
        for (int i = 0; i<10; i++) {

            int n = ss.nextInt();

            if(n<0){
                countNeg = countNeg + 1;
            }else if (n>0) {
                countPositive = countPositive +1;
            }else countZero = countZero +1;
        }
        System.out.println("Negative numbers :" + countNeg + "pcs");
        System.out.println("Positive numbers :" + countPositive + "pcs");
        System.out.println("Number 0 :" + countZero + "pcs");
    }
}
