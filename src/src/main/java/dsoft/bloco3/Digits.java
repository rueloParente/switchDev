package dsoft.bloco3;

public class Digits {
    //The number of digits in a long integer.
    public static int numberDigits (int num){
        return numberToArrayDigits(num).length;
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
