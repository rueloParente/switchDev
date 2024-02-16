package dsoft.bloco3;

public class NumberOperations {
    //Verify if number is capicua
    public static boolean isNumberCapicua (int num){
        int[] digits = Digits.numberToArrayDigits(num);
        int[] invertedDigits = Digits.invertArrayOrder(digits);
        int invertedNum = Digits.arrayOfDigitsToNumber(invertedDigits);
        return (invertedNum==num);
    }
}
