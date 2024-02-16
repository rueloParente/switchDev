package dsoft.bloco3;

public class NumberOperations {
    //Verify if number is capicua
    public static boolean isNumberCapicua (int num){
        int[] digits = Digits.numberToArrayDigits(num);
        int[] invertedDigits = Digits.invertArrayOrder(digits);
        int invertedNum = Digits.arrayOfDigitsToNumber(invertedDigits);
        return (invertedNum==num);
    }
    //Verify if number is Amstrong
    public static boolean isNumberAmstrong (int num){
        int[] digits = Digits.numberToArrayDigits(num);
        int result = 0;
        for (int digit: digits){
            result += (int) Math.pow(digit, 3);
        }
        return result == num;
    }
}
