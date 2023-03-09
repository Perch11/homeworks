package exceptions.ex_11;

public class MethodsString {
    /**
     * this method capitalizes the string
     * @param input type string
     * @return type string
     */
    public String toUppercase(String input) {
        if (input == null) {
            throw new NullPointerException("Input string is null");
        }
        if (input.isEmpty()) {
            throw new IllegalArgumentException("Input string is empty");
        }

        return input.toUpperCase();
    }

    /**
     * this method reverses the string
     * @param input type string
     * @return type string
     */
    public String reverseString(String input) {
        if (input == null) {
            throw new NullPointerException("Input string is null");
        }
        if (input.isEmpty()) {
            throw new IllegalArgumentException("Input string is empty");
        }
        return new StringBuilder(input).reverse().toString();
    }

    /**
     * this method counts the number of vowels
     * @param input string type
     * @return  string type
     */
    public int countVowels(String input) {
        if (input == null) {
            throw new NullPointerException("Input string is null");
        }
        if (input.isEmpty()) {
            throw new IllegalArgumentException("Input string is empty");
        }
        int vowelCount = 0;
        for (char c : input.toCharArray()) {
            if ("AEIOUaeiou".indexOf(c) != -1) {
                vowelCount++;
            }
        }
        return vowelCount;
    }
}

