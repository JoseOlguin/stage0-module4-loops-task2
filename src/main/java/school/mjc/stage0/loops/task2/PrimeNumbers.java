package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        if (printToInclusive < 2) {
            System.out.print("");
        } else {
            int numerator = 2;
            System.out.println(numerator++);
            while (numerator <= printToInclusive) {
                int divisor = 3;
                boolean prime = true;
                while (prime && divisor < numerator) {
                    prime = numerator % divisor != 0;
                    divisor += 2;
                }
                if (prime) {
                    System.out.println(numerator);
                }
                numerator += 2;
            }
        }
    }
}
