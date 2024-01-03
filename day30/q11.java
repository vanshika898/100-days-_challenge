import java.util.*;

public class q11 {
    public static void main(String[] args) {
        final int numStudents = 500;
        final int scoreRange = 101;
        int[] frequencyArray = new int[scoreRange];
        Random random = new Random();
        for (int i = 0; i < numStudents; ++i) {
            int score = random.nextInt(scoreRange);
            if (score > 50) {

                frequencyArray[score]++;
            }
        }
        for (int score = 0; score < frequencyArray.length; ++score) {
            int frequency = frequencyArray[score];
            if (frequency > 0) {
                System.out.println("Score: " + score + ", Frequency: " + frequency);
            }
        }
    }
}
