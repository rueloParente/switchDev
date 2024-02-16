package dsoft.bloco3;

public class NumberOperations {
    //Verify if number is capicua
    public static boolean isNumberPalindromic(int num){
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
    //Return first capicua number in a given interval
    public static int firstPalindromicInRange(int min, int max){
        for (int i=min; i<=max; i++){
            if (NumberOperations.isNumberPalindromic(i)) return i;
        }
        return -1; // as error code, no capicua in range
    }
}
