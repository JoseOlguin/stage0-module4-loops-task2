package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        if (power < 0) {
            System.out.println("too much power");
        } else {
            int acc = 1;
            int counter = 0;

            while (counter++ <= power) {
                System.out.println(acc);
                acc *= 2;
            }
        }
    }
}
