package exceptions.reciprocalnumber;

public class ReciprocalNumber {
    /**
     * this method calculates reciprocal numbers
     * @param number type double
     * @return type double reciprocal or exception
     */
    public double reciprocal(double number) {
        if (number == 0) {
            throw new ArithmeticException("enter other number we cannot divided by zero");
        }
        return 1 / number;
    }
}
