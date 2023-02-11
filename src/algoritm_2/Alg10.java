package algoritm_2;

import java.util.Scanner;

public class Alg10 {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        int n;
        do{
            System.out.print("enter the number:");
            n = ss.nextInt();
        }while(n < 0);

        double sum = 1;
        for(int i = 2; i <= n; i++){

            if(i % 2 == 0){
                sum -= 1.0 / i;
            }else{
                sum += 1.0 / i;
            }

        }
        System.out.println("sum = " + sum);

        System.out.println(Math.log(sum) / Math.log(2));
    }
}
