package dsoft.bloco3;

public class Multiples {
    // Exercise 2 - calculating the number of multiples of given number
    public static int numberMultiplesInRange(int num, int min, int max){
        int result = 0;
        for (int i=min; i<=max; i++){
            if (isMultiple(num, i)) result++;
        }
        return result;
    }

    // Exercise 3 - calculating the number of multiples of two given numbers
    public static int numberMultiplesOfTwoNumbers (int num1, int num2, int min, int max){
        int result =0;
        for (int i=min; i <=max; i++){
            if (isMultiple(num1, i) && isMultiple(num2, i)) result++;
        }
        return result;
    }
    // Exercise 4 - Sum of multiples of two numbers
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
