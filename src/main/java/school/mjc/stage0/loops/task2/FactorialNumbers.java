package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int counter = 1, acc = 1;

        System.out.println(acc);
        while (counter <= printToInclusive) {
            acc *= counter++;
            System.out.println(acc);
        }
    }
}
