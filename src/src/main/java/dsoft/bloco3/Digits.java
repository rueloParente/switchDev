package dsoft.bloco3;

public class Digits {
    //The number of digits in a long integer.
    public static int numberDigits (int num){
        return numberToArrayDigits(num).length;
    }

    //The number of even digits in a integer
    public static int numberEvenDigits (int num){
        int[] digits = numberToArrayDigits(num);
        int result = 0;
        for (int i = 0; i < digits.length; i++){
            if (EvenOdd.isNumberEven(digits[i])) result++;
        }
        return result;
    }
    //The number of odd digits in a integer
    public static int numberOddDigits (int num){
        int[] digits = numberToArrayDigits(num);
        int result = 0;
        for (int i = 0; i < digits.length; i++){
            if (!EvenOdd.isNumberEven(digits[i])) result++;
        }
        return result;
    }
    //The sum of digits in a integer
    public static int sumDigits (int num){
        int[] digits = numberToArrayDigits(num);
        int result = 0;
        for (int i = 0; i < digits.length; i++){
            result += digits[i];
        }
        return result;
    }
    //The sum of even digits in a integer
    public static int sumEvenDigits (int num){
        int[] digits = numberToArrayDigits(num);
        int result = 0;
        for (int i = 0; i < digits.length; i++){
            if (EvenOdd.isNumberEven(digits[i])) result += digits[i];
        }
        return result;
    }
    //The sum of odd digits in a integer
    public static int sumOddDigits (int num){
        int[] digits = numberToArrayDigits(num);
        int result = 0;
        for (int i = 0; i < digits.length; i++){
            if (!EvenOdd.isNumberEven(digits[i])) result += digits[i];
        }
        return result;
    }
    //The number in the inverse order
    public static int inverseNumber (int num){
        int[] digits = numberToArrayDigits(num);
        int[] invertedDigits = invertArrayOrder(digits);
        if (num<0) return -arrayOfDigitsToNumber(invertedDigits);
        else return arrayOfDigitsToNumber(invertedDigits);
    }
    public static int arrayOfDigitsToNumber(int[] array){
        int result = 0;
        for (int i = 0; i < array.length; i++){
            result = result * 10 + array[i];
        }
        return result;
    }

    public static int[] invertArrayOrder (int[] array){
        int[] invertedArray = new int[array.length];
        for (int i=array.length-1, j=0; i>=0; i--, j++){
            invertedArray[j] = array[i];
        }
        return invertedArray;
    }

    public static int[] numberToArrayDigits(int num){
        if (num == 0) return new int[]{0};
        int size = (int)Math.log10(Math.abs(num)) + 1;
        num = Math.abs(num);
        int[] result = new int[size];
         for (int i = size-1; i >= 0; i--){
              result[i] = num % 10;
              num /= 10;
         }
         return result;
    }
}
