package dsoft.bloco3;

public class Factorial {
 // Exercise 1 - calculating the factorial
    public static long numberFactorial (int num) {
      if (validationInputFactorial(num) != 0) return validationInputFactorial(num);
      long result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    private static int validationInputFactorial(int num) {
        if (num < 0) return -1;
        else if (num > 20) return -2;
        else return 0;
    }
}
