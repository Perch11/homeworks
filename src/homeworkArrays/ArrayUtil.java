package homeworkArrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayUtil {

    Scanner ss = new Scanner(System.in);

    //1. Գրել method, որը տպում է int[] n  array-ի դրական տարրերը
    void printPositivePoints(){
        //Scanner ss = new Scanner(System.in);
        int n;
        do{
            System.out.print("enter array length: ");
            n = ss.nextInt();
        }while (n<=2);

        int[] x = new int[n];

        for (int i = 0; i < n; i++) {
            x[i] = ss.nextInt();
        }
        for (int i = 0; i < x.length; i++) {

            if (x[i]>0) System.out.print(x[i]+" ");

        }
    }

// 2.   Գրել method, որը տպում է short[] s  array-ի էլեմենտները հակառակ
//            հերթականությամբ
//      Օրինակ՝ ( 257 -> 752).
    void arrayInverse(){
        //Scanner ss = new Scanner(System.in);
        int n;
        do{
            System.out.print("enter array length: ");
            n = ss.nextInt();
        }while (n<=2);

        int[] x = new int[n];

        for (int i = 0; i < n; i++) {
            x[i] = ss.nextInt();
        }

        for (int i = x.length - 1; i >=0 ; i--) {
            System.out.print(x[i] + " ");
        }
    }

   //3. Գրել method, որը գտնում եւ  տպում է  long[] l array-ի ամենամեծ տարրը.
    void arrayMaxValue(){

        int n;
        do{
            System.out.print("enter array length: ");
            n = ss.nextInt();
        }while (n<=2);

        long[] x = new long[n];

        for (int i = 0; i < n; i++) {
            x[i] = ss.nextLong();
        }
        long maxValue = Long.MIN_VALUE;

        for (int i = 0; i < x.length; i++) {

            if(x[i] > maxValue)
                maxValue = x[i];
        }
        System.out.println("maxValue = " + maxValue);
    }
//  4. Գրել method, որը գտնում եւ տպում է  float[] f  array-ի ամենափոքր տարրը.
    void arrayMinValue(){

        int n;
        do{
            System.out.print("enter array length: ");
            n = ss.nextInt();
        }while (n<=2);

        float[] x = new float[n];

        for (int i = 0; i < n; i++) {
            x[i] = ss.nextFloat();
        }
        float minValue = Float.MAX_VALUE;

        for (int i = 0; i < x.length; i++) {

            if(x[i] < minValue)
                minValue = x[i];
        }

        System.out.println("minValue = " + minValue);
    }

    // 5.Գրել method, որը int[] n array-ի էլեմենտները եւ տեղափոխում  int[] m  array-ի մեջ։
    void arrayCopy(){

        int n;
        do{
            System.out.print("enter array length: ");
            n = ss.nextInt();
        }while (n<=2);

        int[] x  = new int[n];

        for (int i = 0; i < n; i++) {
            x[i] = ss.nextInt();
        }
        int[] y = new int[n];

        for (int i = 0; i < x.length; i++) {
            y[i] = x[i];
            System.out.print(y[i] + " ");
        }
    }
//    6. Գրել method, որը ստեղծում է երկու նույն չափը ունեցող array-ներ գումարում է
//    array -ի համապատասխան էլեմենտները եւ գրում երրորդ array-ի մեջ։
//    Oրինակ՝
//    array1 = {1,5,6,4,7}
//    array2 = {7,4,2,3,5}
//    array3 = {8,9,8,7,12}

    void sumTwoArrays(){
        int n;
        do{
            System.out.print("enter array length: ");
            n = ss.nextInt();
        }while (n<=2);

        int[] x = new int[n], y = new int[n], z = new int[n];
        System.out.println("input first array");
        for (int i = 0; i < n; i++) {
            x[i] = ss.nextInt();
        }
        System.out.println("input second array");
        for (int i = 0; i < n; i++) {
            y[i] = ss.nextInt();
        }
        System.out.println("sum two array elements");
        for (int i = 0; i < x.length; i++) {

            z[i] = x[i] + y[i];
            System.out.println(z[i]);
        }
    }

//    7. Գրել method, որը հաշվում է թե քանի անգամ է  k թիվը հանդիպել array-ի
//    Էլեմենտների մեջ։
//    Oրինակ՝ array = {1,5,6,4,5}
//    k = 5;
//    2
    void countK(){

        int n;
        do{
            System.out.print("enter array length: ");
            n = ss.nextInt();
        }while (n<=2);

        int[] x = new int[n], y = new int[n], z = new int[n];
        System.out.print("input array elements ");
        for (int i = 0; i < n; i++) {
            x[i] = ss.nextInt();
        }
        System.out.print("input k = ");
        int k = ss.nextInt();
        int count=0;

        for (int i = 0; i < x.length; i++) {

            if (x[i] == k)
                count++;

        }
        System.out.println("count = " + count);

    }
//    13  Ներածել n բնական թիվը 2-ական տեսքով՝ ստանալով 0-ներից ու 1-երից կազմված .
//    զանգված եւ արտածել n  թվի 10-ական ներկայացումը:
//    Oրինակ՝    array = {1,1,0,0,1,1}
//    // 51

    void convertArr(int[] x){

        int sum = 0;
        for (int i = x.length - 1; i>=0 ; i--) {

            if (x[i] == 1)
                sum+=Math.pow(2,i) ;
        }
        System.out.println(sum);

    }



    //   14  Տպել տրված մատրիցի գլխավորա անկյունագծից վերեւ բոլոր տարերը:
    void headDiagonalAbove(){
        int n;
        do{
            System.out.print("enter array length: ");
            n = ss.nextInt();
        }while (n<=2);
        System.out.println("input matrix elements");
        int [][] x = new int[n][n];
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                x[i][j] = ss.nextInt();
            }
        }
        for (int i = 0; i < x.length - 1; i++) {

            for (int j = i+1; j < x[i].length; j++) {

                System.out.print(x[i][j] + " ");
            }
            System.out.println();
        }

    }


//    15  Շրջել տրված ամբողջ թվերի քառակուսային մատրիցը գլխավոր անկյունագծի .
//    նկատմամբ:

     void swapMatrix(){
         int n;
         do{
             System.out.print("enter array length: ");
             n = ss.nextInt();
         }while (n<=2);
         System.out.println("input matrix elements");
         int [][] x = new int[n][n];
         for (int i = 0; i < n; i++) {

             for (int j = 0; j < n; j++) {

                 x[i][j] = ss.nextInt();
             }
         }
         for (int i = 0; i < x.length; i++) {

             for (int j = 0; j < x[i].length ; j++) {

                 if(i != j){
                     x[i][j] = x[j][i]^x[i][j];
                     x[j][i] = x[j][i]^x[i][j];
                     x[i][j] = x[j][i]^x[i][j];
                 }
             }
         }
         for (int i = 0; i < n; i++) {
             for (int j = 0; j < n; j++) {
                 System.out.print(x[i][j] + " ");
             }
             System.out.println();
         }
     }
//     16  Տրված բնական թվերի քառակուսային մատրիցի համար արտածել YES, եթե նրա .
//    բոլոր տողերի տարրերի գումարը զույգ է։  NO հակառակ դեպքում։
//    Oրինակ՝
//    a = {1,-1,0,0}
//    {2,-2,1,-1}        // YES
//    {9,7,1,-17}
//    a = {1,1,0,0}
//    {2,-2,1,-1}        //NO
//    {9,7,1,-17}
    boolean sumElementsOddOrEven(int[] x){
        int sum = 0;
        for (int i = 0; i < x.length; i++) {
            sum += x[i];
        }if(sum % 2==0){
            return true;
        }
        else return false;
    }
    void arrYesOrNO(){
        int n;
        do{
            System.out.print("enter array length: ");
            n = ss.nextInt();
        }while (n<=2);
        System.out.println("input matrix elements");
        int [][] x = new int[n][n];
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                x[i][j] = ss.nextInt();
            }
        }
        int count = 0;
        for (int i = 0; i < x.length; i++) {

            if(sumElementsOddOrEven(x[i])){
             count++;
            }
        }
        if (count == n)
            System.out.println("yes");
        else
            System.out.println("no");

    }


    public static void main(String[] args) {

        ArrayUtil arr = new ArrayUtil();
        int[] arr1 =new int[]{1,0,1,0,1,1,1,0};
        //arr.printPositivePoints();
        //arr.arrayInverse();
        //arr.arrayMaxValue();
        //arr.arrayMinValue();
        //arr.arrayCopy();
        //arr.sumTwoArrays();
        //arr.countK();
        //arr.swapMatrix();
        //arr.headDiagonalAbove();
        //arr.arrYesOrNO();
        //arr.convertArr(arr1);

    }
}
