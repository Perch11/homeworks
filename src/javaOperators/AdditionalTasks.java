package javaOperators;

public class AdditionalTasks {
      int count = 0;
      int sum = 0;

    /**
     * counts the sum of numbers 1-100
     * has not input parameters
     * @return int type
     */
    int sum(){
        count++;

        if(count <= 100){

            sum += count;

            sum();

        }
        return sum;
    }




    public static void main(String[] args) {
                       //gtnel ev uxxel sxal@
//        float y = 2.1f;


//        byte x = 5;
//        byte y = 10;
//        int z = x + y;


//        short x = 10;
//        short y = 3;
//        int z = x * y;


//        long x = 10;
//        long y = 5;      int y = 5
//        y = y * x;  kam  y *= x
//       System.out.println(y);


        int x = 10, y = 5;
        x = x + y; // 15
        y = x - y; // 10
        x = x - y; // 5
        System.out.println(x);
        System.out.println(y);

         x = x ^ y;
         y = x ^ y;
         x = x ^ y;
        System.out.println(x);
        System.out.println(y);



        AdditionalTasks ad = new AdditionalTasks();

        int sum = ad.sum();

        System.out.println(sum);

        System.out.println((100*(100+1))/2);


    }
}
