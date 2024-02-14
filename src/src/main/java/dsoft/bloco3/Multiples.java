package dsoft.bloco3;

public class Multiples {
    // The number of multiples of a given integer in a given interval.
    public static int numberMultiplesInRange(int num, int min, int max){
        int result = 0;
        for (int i=min; i<=max; i++){
            if (isMultiple(num, i)) result++;
        }
        return result;
    }
    // The number of multiples of two integers in a given interval.
    public static int numberMultiplesOfTwoNumbers (int num1, int num2, int min, int max){
        int result =0;
        for (int i=min; i <=max; i++){
            if (isMultiple(num1, i) && isMultiple(num2, i)) result++;
        }
        return result;
    }
    // The sum of the multiples of two integers in a given interval.
    public static int sumMultiplesOfTwoNumbers (int num1, int num2, int min, int max){
        int result = 0;
        for (int i=min; i<=max; i++){
            if (isMultiple(num1, i) && isMultiple(num2, i)) result += i;
        }
        return result;
    }
    public static boolean isMultiple (int num, int div){
        if (num == 0) return true;
        else return div % num == 0;
    }

}
