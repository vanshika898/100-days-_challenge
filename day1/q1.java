import java.util.Scanner;

public class day2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = sc.nextInt();
        System.out.println("Enter the Second number:");
        int b = sc.nextInt();
        System.out.println("Enter the third number:");
        int c = sc.nextInt();
        int average = (a + b + c) / 3;
        System.out.printf("The average of three numbers %d, %d, %d is %d", a, b, c, average);
    }
}








