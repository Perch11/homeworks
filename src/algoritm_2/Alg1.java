package algoritm_2;

import java.util.Scanner;

public class Alg1 {

    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        System.out.print("Enter the positive number: ");
        int n = ss.nextInt();
        if(n<=0){

            System.out.println("please enter the positive number");
        }
        else
        {
            for(int i = 1; i<=10;i++){
                System.out.println(n + " * " + i + " = "  + n * i );
            }
        }

    }
}
