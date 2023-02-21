package homework_string_stringbuilder;

import java.util.Scanner;

import static sun.util.locale.LocaleUtils.isEmpty;

public class StringUtil {
    Scanner ss = new Scanner(System.in);

    /** method 1
     *This method executes String concatenation
     */
    void stringConcat(){

        String str1 = "hello";
        String str2= "world";
        String str3 = "1";

        int a = 1, b = 2;

        System.out.println(str1 + str2);
        System.out.println(a + b + str1);
        System.out.println(str3 + b + str1);
        System.out.println(str1 + a + b + str2);
    }

    /** method 1*
     * This method executes StringBuilder concatenation
     */
    void StringBuilderConcat(){
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();
        StringBuilder str3 = new StringBuilder();
        StringBuilder str4 = new StringBuilder();

        System.out.println(str1.append("hello").append("world"));
        System.out.println(str2.append(1+2).append("hello"));
        System.out.println(str3.append("1").append(2).append("hello"));
        System.out.println(str4.append("hello").append(1).append(2).append("world"));
    }

    /**method 3
     * This method reverses the strings
     * @param str -StringBuilder
     * @return - reverse StringBuilder
     */
    StringBuilder reverseString(StringBuilder str){
        if(str.length() == 0){
            return null;
        }

        char[] ch = new char[str.length()];
        int index = 0;
        for (int i = str.length() - 1; i >= 0 ; i--) {
            ch[index] = str.charAt(i);
            index++;
        }

        StringBuilder rev = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            rev.append(ch[i]);
        }
        return rev;
    }

    /**method 2
     * This method splits a string into multiple strings
     * @param str -  type String
     */
    void StringLiterals(String str){

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' '){
                System.out.print("\n");
            }
            else System.out.print(ch);
        }
    }

    /**
     *
     * @param token - type string
     * @param str - type string
     * @return type int count
     */
    int countToken(String token, String str){
        if(isEmpty(str) || isEmpty(token)) {
            System.out.println("empty string or token");
            return 0;
        }
        if(token.length() > str.length()){
            System.out.println("token is longer than string");
            return -1;
        }
        int M = token.length();
        int N = str.length();
        int count = 0;

        for (int i = 0; i <= N - M; i++) {

            int j;
            for (j = 0; j < M; j++) {
                if (str.charAt(i + j) != token.charAt(j)) {
                    break;
                }
            }
            if (j == M) {
                count++;
                j = 0;
            }
        }
        return count;
    }

    /**method 5
     * This method makes the string uppercase
     * @param str - type string
     * @param str1 - type StringBuilder
     */
    void stringToUpperCase(String str,StringBuilder str1){

        str = str.toUpperCase();
        StringBuilder str2;
        str2 = new StringBuilder(str1.toString().toUpperCase());
        System.out.println(str);
        System.out.println(str2);
    }

    /**method 6
     * This method gets the maximum number of characters in the string and adds "*"
     */
    void stringArmenia(){
        StringBuilder str = new StringBuilder(20);
        str.append(ss.nextLine());

        if(str.length() == str.capacity()){
            System.out.println(str);
            return;}
        else{

        for (int i = str.length(); i < str.capacity(); i++) {
            str.append("*");
        }

        System.out.println(str);

        }
        System.out.println(str.length());
        System.out.println(str.capacity());
    }

    /**method10
     * method returns the index of the given string
     * @param str1 - type string
     * @param str2 - type string
     * @return type int
     */
     int stringIndex(String str1,String str2){

        int a = str1.indexOf(str2);
        return a;
     }

    /**method 12
     * This method checks string is empty or not
     * @param str - string type
     */
     void nullOrEmpty(String str){
         if ((str == null)){
             System.out.println("string is null");
         }else if(str.length() == 0){
             System.out.println("empty string");
         }else System.out.println(str);
     }

    /**method 7
     * This method removes the given symbol
     * @param str - type string
     */
     void remove(String str){

         str = str.replace("a","");
         System.out.println(str);
     }
    /**method 8
     * This method removes the given symbol
     * @param str - type string
     */
    void remove2(String str){

        str = str.replace("a","*");
        System.out.println(str);
    }


    /**method 11
     * This method prints the substring at the given index from beginning
     * @param str - string type
     * @param n -int type
     */
    void subString(String str, int n){

         str =str.substring(0,n);
        System.out.println(str);
    }
    /**method 11*
     * This method prints the substring at the given index from beginning
     * @param str - StringBuilder type
     * @param n -int type
     */
    void subString2(StringBuilder str, int n){

        str.delete(n+1,str.length());
        System.out.println(str);

    }

    public static void main(String[] args) {
        StringUtil string = new StringUtil();

        string.stringConcat();
        string.StringBuilderConcat();

        StringBuilder str;
        str =  string.reverseString(new StringBuilder("Hello what your name?"));
        System.out.println(str);

        string.StringLiterals(" hello how are you bro?");

        string.stringToUpperCase("food",new StringBuilder("tree"));

        string.stringArmenia();

        System.out.println(string.stringIndex("","c"));

        string.nullOrEmpty(null);


        string.remove("We are living in a yellow submarine. We don't  have anything");

        string.remove2("We are living in a yellow submarine. We don't  have anything");

        string.subString("",6);
        string.subString2(new StringBuilder("hello world"),6);
    }
}
