import java.util.Scanner;
import java.util.Stack;

class Friend {
    int popularity;

    public Friend(int popularity) {
        this.popularity = popularity;
    }
}

public class q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of test cases
        int T = scanner.nextInt();

        for (int t = 0; t < T; t++) {
            // Input the number of friends and the number of friends to delete
            int N = scanner.nextInt();
            int K = scanner.nextInt();

            // Create a stack to simulate the deletion process
            Stack<Friend> friendsStack = new Stack<>();

            // Input the popularity of friends
            for (int i = 0; i < N; i++) {
                int popularity = scanner.nextInt();
                Friend friend = new Friend(popularity);

                // Implement Christie's algorithm to delete friends
                while (K > 0 && !friendsStack.isEmpty() && friendsStack.peek().popularity < popularity) {
                    friendsStack.pop();
                    K--;
                }

                friendsStack.push(friend);
            }

            Friend[] result = new Friend[friendsStack.size()];
            for (int i = friendsStack.size() - 1; i >= 0; i--) {
                result[i] = friendsStack.pop();
            }

            for (int i = 0; i < result.length - K; i++) {
                System.out.print(result[i].popularity + " ");
            }

            System.out.println();
        }

        scanner.close();
    }
}
