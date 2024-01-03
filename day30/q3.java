import java.util.Random;

public class q3 {
    public static void main(String[] args) {
        int[] scores = generateRandomScores(500);
        int[] frequencies = new int[101]; // Assuming scores are in the range [0...100]

        // Calculate frequencies
        for (int score : scores) {
            if (score > 50) {
                frequencies[score]++;
            }
        }

        // Print frequencies
        for (int i = 51; i <= 100; i++) {
            System.out.println("Score " + i + ": " + frequencies[i]);
        }
    }

    // Method to generate 500 random scores
    private static int[] generateRandomScores(int count) {
        int[] scores = new int[count];
        Random random = new Random();

        for (int i = 0; i < count; i++) {
            scores[i] = random.nextInt(101); // Generates random score in the range [0...100]
        }

        return scores;
    }
}
