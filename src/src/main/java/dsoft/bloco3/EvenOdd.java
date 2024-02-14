package dsoft.bloco3;

import static java.lang.Float.NaN;

public class EvenOdd {
    //The sum of all even numbers in a given interval.
    public static int sumEvenNumbersInRange (int min, int max){
        int result = 0;
        for (int i = min; i<max; i++){
            if (isNumberEven(i)) result += i;
        }
        return result;
    }
    //The sum of all even numbers in a given interval.
    public static int sumOddNumbersInRange (int min, int max){
        int result = 0;
        for (int i=min; i<max; i++){
            if (!isNumberEven(i)) result += i;
        }
        return result;
    }
    public static boolean isNumberEven (int num){
        if (num % 2 == 0) return true;
        else return false;
    }
    //The product of all multiples of a given number in a given interval.
    public static int productOfMultiples (int num, int min, int max){
        int result = 1;
        int count = 0;
        for (int i=min; i<=max; i++){
            if (Multiples.isMultiple(num, i)) {
                result *= i;
                count++;
            }
        }
        if (count == 0) return 0;
        else return result;
    }

    //The average of the multiples of a given number in an interval defined by two numbers.
    public static double averageMultiplesGivenNumber (int num, int min, int max){
        int sum = Multiples.sumMultiplesOfTwoNumbers(num, num, min, max);
        int occurrences = Multiples.numberMultiplesInRange(num, min, max);
        return averageCalculator(sum, occurrences);
    }
    public static double averageCalculator (int num, int occurrences){
        if (occurrences==0) return NaN;
        else return (double) num / occurrences;
    }

}
