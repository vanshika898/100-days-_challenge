import java.util.Scanner;

public class day2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side of the square: ");
        int side = sc.nextInt();
        int area = side * side;
        System.out.println("The area of the square is: " + area);
    }
}
