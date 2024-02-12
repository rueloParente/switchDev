package DSOFT;

public class Bloco3 {
 // Exercise 1 - calculating the factorial
    public static long numberFactorial (int num) {
      if (validationInputFactorial(num) != 0) return validationInputFactorial(num);
      long result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }

// Exercise 2 - calculating the number of multiples of given number
    public static int numberMultiplesInRange(int num, int min, int max){
        int result = 0;
        for (int i=min; i<=max; i++){
            if (num==0) return multiplesOfZeroInRange(min, max); // as 0 is multiple of all numbers
            else if (i % num == 0) result++;
        }
        return result;
    }
    private static int multiplesOfZeroInRange (int min, int max) {
        int result = 0;
        for (int i = min; i <= max; i++) {
            result++;
        }
        return result;
    }

    private static int validationInputFactorial(int num) {
        if (num < 0) return -1;
        else if (num > 20) return -2;
        else return 0;
    }
}
