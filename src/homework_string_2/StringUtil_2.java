package homework_string_2;

import java.util.*;



import static sun.util.locale.LocaleUtils.isEmpty;

public class StringUtil_2 {
    /**1
     * Given a string, return a string made of the first 2 chars (if present), however
     * include first char only if it is 'o' and include the second only if it is 'z', so
     * "ozymandias" yields "oz"
     * @param s - type string
     * @return type string
     */
    String returnstring(String s){
        if(isEmpty(s)) {
            System.out.println("empty string");
            return null;
        }
        if(s.charAt(0)=='o'&& s.charAt(1) == 'z'){
            return s = "oz";
        }else{
            System.out.print("other string:   ");
            return s;
        }
    }

    /**2
     * Count the number of "xx" in the given string. We'll say that overlapping is
     * allowed, so "xxx" contains 2 "xx".
     * @param s -type string
     * @return type int count
     */

    int countXX(String s){
        if(isEmpty(s)) {
            System.out.println("empty string");
            return -1;
        }

        int count = 0;
        for (int i = 0; i < s.length()-1; i++) {

            if (s.charAt(i) == 'x' && s.charAt(i + 1) == 'x') {
                count++;
            }

        }
        return count;
    }


    /** 9
     * Given two strings, find the number of common characters between them.
     * @param s1 -type string
     * @param s2 -type string
     * @return type int count
     */
     int countChars(String s1,String s2){
         if(isEmpty(s1) || isEmpty(s2)) {
             System.out.println("empty string or strings");
             return -1;
         }

        int n1 = s1.length();
        int n2 = s2.length();

        int []freq1 = new int[58];
         Arrays.fill(freq1, 0);

        int []freq2 = new int[58];
        Arrays.fill(freq2, 0);

        int count = 0;

        for (int i = 0; i < n1; i++) {
            freq1[s1.charAt(i) - 'A']++;
        }
        for (int i = 0; i < n2; i++) {
            freq2[s2.charAt(i) - 'A']++;
        }
        for (int i = 0; i < 57; i++) {
            count += (Math.min(freq1[i], freq2[i]));
        }
        return count;
    }

    /**3
     * A palindrome is a word which reads the same backward or forward. 'abcba' is
     * a palindrome. Write a method that detects if a string is a palindrome.
     * @param s - type string
     * @return type boolean
     */
    boolean palindrome(String s){
        if(isEmpty(s)) {
            System.out.println("empty string");
            return false;
        }
         boolean n = false;
        for (int i = 0,j = s.length()-1; i <= s.length()/2 ; i++,j--) {
            if(s.charAt(i) == s.charAt(j)){
                n =  true;
            }else {
                n = false;
                break;
            }
        }
       return n;
    }

    /**4
     * Given a list of strings, write a method that returns a list of all strings that
     * start with the letter 'a' (lower case) and have exactly 3 letters
     * @param input type List<String>
     * @return type List<String>
     */
     List<String> filterStrings(List<String> input) {
        List<String> result = new ArrayList<>();

        for (String s : input) {
            if (s.startsWith("a") && s.length() == 3) {
                result.add(s);
            }
        }

        return result;
    }

    /**7
     * A palindrome is a word which reads the same backward or forward. 'abcba' is
     * a palindrome. Write a method that returns the longest palindrome substring
     * of a given string.
     * @param s - type string
     * @return type string
     */
    String longestPalindrome(String s) {
        if(isEmpty(s)) {
            System.out.println("empty string");
            return null;
        }
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        String longest = "";

        for (int i = 0; i < n; i++) {
            dp[i][i] = true;
            longest = s.substring(i, i + 1);
        }
        for (int len = 2; len <= n; len++) {
            for (int i = 0; i < n - len + 1; i++) {
                int j = i + len - 1;

                if (s.charAt(i) == s.charAt(j)) {
                    if (len == 2) {
                        dp[i][j] = true;
                    } else {
                        dp[i][j] = dp[i + 1][j - 1];
                    }
                    if (dp[i][j] && len > longest.length()) {
                        longest = s.substring(i, j + 1);
                    }
                }
            }
        }
        return longest;
    }



    public static void main(String[] args) {
        StringUtil_2 str = new StringUtil_2();

        System.out.println(str.returnstring("afsui"));

        System.out.println(str.countXX("xxax xxaxeerewr"));

        System.out.println(str.countChars("uituaAUyaA","uituaAuaU"));

        System.out.println(str.palindrome("abaa"));
        List<String> input = new ArrayList<>();
        input.add("apple");
        input.add("banana");
        input.add("ant");
        input.add("dog");
        input.add("age");
        input.add("any");
        input.add("cat");

        List<String> output = str.filterStrings(input);
        System.out.println("Input list: " + input);
        System.out.println("Output list: " + output);

        System.out.println(str.longestPalindrome("srtrsutuwewiimdvvevevv"));
    }
}


