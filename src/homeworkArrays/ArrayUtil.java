package homeworkArrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayUtil {

    Scanner ss = new Scanner(System.in);

    /**
     * This method has not input parameters,
     * and prints positive elements in array.
     */
    void printPositivePoints(){

        int n;
        do{
            System.out.print("enter array length: ");
            n = ss.nextInt();
        }while (n <= 2);

        int[] x = new int[n];

        for (int i = 0; i < n; i++) {
            x[i] = ss.nextInt();
        }
        for (int i = 0; i < x.length; i++) {

            if (x[i] > 0) System.out.print(x[i] + " ");
        }
    }

    /**
     * This method has not input parameters,
     * method iterates over and prints the given array.
     */
    void arrayInverse(){
        //Scanner ss = new Scanner(System.in);
        int n;
        do{
            System.out.print("enter array length: ");
            n = ss.nextInt();
        }while (n <= 2);

        int[] x = new int[n];

        for (int i = 0; i < n; i++) {
            x[i] = ss.nextInt();
        }

        for (int i = x.length - 1; i >=0 ; i--) {
            System.out.print(x[i] + " ");
        }
    }

    /**
     *  This method has not input parameters,
     *  method finds the largest element of the array
     */
    void arrayMaxValue(){

        int n;
        do{
            System.out.print("enter array length: ");
            n = ss.nextInt();
        }while (n <= 2);

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


    /**
     *  This method has not input parameters,
     *  method finds the smallest element in an array
     */
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


    /**
     * This method has not input parameters,
     * method moves the elements of the given array into the second array
     */
    void arrayCopy(){
        int n;
        do{
            System.out.print("enter array length: ");
            n = ss.nextInt();
        }while (n <= 2);

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

    /**
     * This method has not input parameters,
     * method adds the corresponding elements of the two arrays and writes them to a third array
     */
    void sumTwoArrays(){
        int n;
        do{
            System.out.print("enter array length: ");
            n = ss.nextInt();
        }while (n <= 2);

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
            System.out.println( z[i] );
        }
    }

    /**
     * This method has not input parameters,
     * method counts the number of times a given number occurs in a given array
     */
    void countK(){

        int n;
        do{
            System.out.print("enter array length: ");
            n = ss.nextInt();
        }while (n <= 2);

        int[] x = new int[n];
        System.out.print("input array elements ");
        for (int i = 0; i < n; i++) {
            x[i] = ss.nextInt();
        }
        System.out.print("input k = ");
        int k = ss.nextInt();
        int count = 0;

        for (int i = 0; i < x.length; i++) {

            if (x[i] == k)
                count++;
        }
        System.out.println("count = " + count);
    }

    /**
     * This method has not input parameters,
     * method sorts the array elements in descending order
     */
    void sorting(){
        int n;
        do{
            System.out.print("enter array length: ");
            n = ss.nextInt();
        }while (n <= 2);

        int[] x = new int[n];
        System.out.print("input array elements ");
        for (int i = 0; i < n; i++) {
            x[i] = ss.nextInt();
        }
        boolean sort = false;
        while(!sort){
            sort = true;
            for (int i = 0; i < x.length - 1; i++) {
                if (x[i]<x[i +1])
                {
                    sort = false;
                    x[i] = x[i] ^ x[i + 1];
                    x[i + 1] = x[i] ^ x[i +1];
                    x[i] = x[i] ^ x[i + 1];
                }
            }
        }
        for (int i = 0; i < x.length; i++)
            System.out.print(x[i] + " ");
    }

    /**
     * This method has not input parameters,
     * method removes all zeros from the array
     */
    void removeZeroesOne(){
        int n;
        do{
            System.out.print("enter array length: ");
            n = ss.nextInt();
        }while (n<=2);

        int[] x = new int[n];
        System.out.print("input array elements ");
        for (int i = 0; i < n; i++) {
            x[i] = ss.nextInt();
        }
        int count = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i] != 0)
                count++;
        }
        if(count == 0){
            System.out.println("all elements are 0");
            removeZeroesOne();
        }
        int[] y = new int[count];
        for (int i = 0, j = 0; i < x.length && j< y.length; i++) {
            if(x[i] != 0){
                y[j] = x[i];
                j++;
            }
        }
        for (int i = 0; i < y.length; i++) System.out.print(y[i] + " ");
    }

    /**
     * This method has a input parameter
     * @param x =  int array[],
     * method obtains the decimal code of the same number from the binary code
     */
    void convertArr(int[] x){

        int sum = 0;
        for (int i = x.length - 1; i >= 0 ; i--) {

            if (x[i] == 1)
                sum += Math.pow(2 , x.length -1 - i) ;
        }
        System.out.println( sum );
    }

    /**
     * This method has not input parameters,
     * method prints the elements above the main diagonal of the matrix
     */
    void headDiagonalAbove(){
        int n;
        do{
            System.out.print("enter array length: ");
            n = ss.nextInt();
        }while (n <= 2);
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

    /**
     * This method has not input parameters,
     * method flips the matrix elements with respect to the main diagonal
     */
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
         for (int i = 0; i < x.length - 1; i++) {
             for (int j = i +1; j < x[i].length ; j++) {
                     x[i][j] = x[j][i]^x[i][j];
                     x[j][i] = x[j][i]^x[i][j];
                     x[i][j] = x[j][i]^x[i][j];
             }
         }
         for (int i = 0; i < n; i++) {
             for (int j = 0; j < n; j++) {
                 System.out.print(x[i][j] + " ");
             }
             System.out.println();
         }
     }

    /**
     * This method has input parameter - array,
     * method calculates whether the sum of the elements of the given string is even or odd
     * @param x int array[]
     * @return true or false
     */
    boolean sumElementsOddOrEven(int[] x){
        int sum = 0;
        for (int i = 0; i < x.length; i++) {
            sum += x[i];
        }if(sum % 2==0){
            return true;
        }
        else return false;
    }

    /**
     * This method has not input parameters,
     * method calculates the sum of the elements of all rows of the given matrix, whether odd or even
     * and last prints yes or no
     */
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

    /**
     * This method has not input parameters,
     * method sorts the elements of the array so that the odd ones are at the end
     */
    void oddElementsInLast(){
        int n;
        do{
            System.out.print("enter array length: ");
            n = ss.nextInt();
        }while (n<=2);

        int[] x = new int[n];
        System.out.print("input array elements ");
        for (int i = 0; i < n; i++) {
            x[i] = ss.nextInt();
        }
        int len = 0;
        int count = 0;
        for(int j = 0; j < x.length; j++) {
            for (int i = count; i < x.length - len; i++) {
                if ((x[i] & 1) == 1 && (x[x.length - len - 1] & 1) == 1) {
                    len++;
                    break;
                }
                else if ((x[i] & 1) == 1 && (x[x.length - len - 1] & 1) != 1) {
                    x[x.length - len - 1] = x[x.length - len - 1] ^ x[i];
                    x[i] = x[x.length - len - 1] ^ x[i];
                    x[x.length - len - 1] = x[x.length - len - 1] ^ x[i];
                    len++;
                    count++;
                } else if (x[i] % 2 == 0) {
                    count++;
                    break;
                }
            }
        }
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
    }

    public static void main(String[] args) {

        ArrayUtil arr = new ArrayUtil();

        int[] arr1 =new int[]{1,1,1,1,0};

        //arr.printPositivePoints(); //1
        //arr.arrayInverse();        //2
        //arr.arrayMaxValue();       //3
        //arr.arrayMinValue();       //4
        //arr.arrayCopy();           //5
        //arr.sumTwoArrays();        //6
        //arr.countK();              //7
        //arr.swapMatrix();          //15
        //arr.headDiagonalAbove();   //14
        //arr.arrYesOrNO();          //16
        //arr.convertArr(arr1);      //13
        //arr.sorting();             //9
        //arr.removeZeroesOne();     //11
        //arr.oddElementsInLast();   //10

    }
}
