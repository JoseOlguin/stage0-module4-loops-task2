package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        if (multiplyByAndToInclusive != 0) {
            int i = 0;
            int k = multiplyByAndToInclusive < 0 ? multiplyByAndToInclusive * -1 : multiplyByAndToInclusive;

            while (i <= k) {
                System.out.println(multiplyByAndToInclusive * i++);
            }
        } else {
            System.out.print("");
        }
    }
}
