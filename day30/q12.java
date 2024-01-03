import java.util.Scanner;

public class q12 {
    private static final int MAX_DEGREE = 10;

    public static void multiplyPolynomials(int[][] poly1, int[][] poly2, int[][] result, int deg1, int deg2) {
        for (int i = 0; i <= deg1 * 2; ++i) {
            for (int j = 0; j <= deg2 * 2; ++j) {
                result[i][j] = 0;
                for (int k = 0; k <= deg1; ++k) {
                    for (int l = 0; l <= deg2; ++l) {
                        if (k + l == i && poly1[i][k] != 0 && poly2[l][j] != 0) {
                            result[i][j] += poly1[i][k] * poly2[l][j];
                        }
                    }
                }
            }
        }
    }

    public static void displayPolynomial(int[][] poly, int degree) {
        for (int i = 0; i <= degree * 2; ++i) {
            for (int j = 0; j <= degree; ++j) {
                if (poly[i][j] != 0) {
                    System.out.printf("%dx^%dy^%d ", poly[i][j], i - j, j);
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the degree of the first polynomial: ");
        int deg1 = scanner.nextInt();
        System.out.print("Enter the degree of the second polynomial: ");
        int deg2 = scanner.nextInt();

        int[][] poly1 = new int[MAX_DEGREE + 1][MAX_DEGREE + 1];
        int[][] poly2 = new int[MAX_DEGREE + 1][MAX_DEGREE + 1];
        int[][] result = new int[MAX_DEGREE * 2 + 1][MAX_DEGREE * 2 + 1];

        System.out.println("Enter the coefficients of the first polynomial:");
        for (int i = 0; i <= deg1 * 2; ++i) {
            for (int j = 0; j <= deg1; ++j) {
                System.out.printf("Coeff for x^%dy^%d: ", i - j, j);
                poly1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter the coefficients of the second polynomial:");
        for (int i = 0; i <= deg2 * 2; ++i) {
            for (int j = 0; j <= deg2; ++j) {
                System.out.printf("Coeff for x^%dy^%d: ", i - j, j);
                poly2[i][j] = scanner.nextInt();
            }
        }

        multiplyPolynomials(poly1, poly2, result, deg1, deg2);

        System.out.println("Result of multiplication:");
        displayPolynomial(result, deg1 + deg2);
    }
}
