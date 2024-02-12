package DSOFT;

public class Bloco3 {
 // Exercise 1 - calculating the factorial
    public static long numberFactorial (int num) {
      if (validationInput(num) != 0) return validationInput(num);
      long result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }
    private static int validationInput(int num) {
        if (num < 0) return -1;
        else if (num > 20) return -2;
        else return 0;
    }
}
