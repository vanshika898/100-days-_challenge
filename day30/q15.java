import java.util.*;

public class q15 {
    private static void deleteFriends(ArrayList<Integer> friendList, int numToDelete) {
        for (int i = 0; i < numToDelete; ++i) {
            boolean deletedFriend = false;

            for (int j = 0; j < friendList.size() - 1; ++j) {
                if (friendList.get(j) < friendList.get(j + 1)) {
                    friendList.remove(j);
                    deletedFriend = true;
                    break;
                }
            }
            if (!deletedFriend && !friendList.isEmpty()) {
                friendList.remove(friendList.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of test cases: ");
        int numTestCases = scanner.nextInt();
        for (int testCase = 1; testCase <= numTestCases; ++testCase) {
            int numFriends, numToDelete;
            do {
                System.out.print("Enter  number of friends for testcase " + testCase + ": ");
                numFriends = scanner.nextInt();

                if (numFriends <= 0) {
                    System.out.println("No of friends should be greater than 0. Try again.");
                }
            } while (numFriends <= 0);
            do {
                System.out.print("Enter the number of friends to delete for test case " + testCase + ": ");
                numToDelete = scanner.nextInt();

                if (numToDelete < 0 || numToDelete > numFriends) {
                    System.out.println("Invalid number of friends to delete. Try again.");
                }
            } while (numToDelete < 0 || numToDelete > numFriends);

            ArrayList<Integer> friendList = new ArrayList<>();

            System.out.print("Enter the popularity of each friend separated by space: ");
            for (int j = 0; j < numFriends; ++j) {
                friendList.add(scanner.nextInt());
            }
            deleteFriends(friendList, numToDelete);
            System.out.print("Remaining friends for test case " + testCase + ": ");
            for (int friendPopularity : friendList) {
                System.out.print(friendPopularity + " ");
            }
            System.out.println("\n");
        }
    }
}
