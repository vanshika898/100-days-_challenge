class PolynomialTerm {
    int coefficient;
    int exponentX;
    int exponentY;

    public PolynomialTerm(int coefficient, int exponentX, int exponentY) {
        this.coefficient = coefficient;
        this.exponentX = exponentX;
        this.exponentY = exponentY;
    }

    public String toString() {
        return coefficient + "x^" + exponentX + "y^" + exponentY;
    }
}

public class q17 {
    public static void main(String[] args) {
        PolynomialTerm[] poly1 = {
                new PolynomialTerm(2, 2, 1),
                new PolynomialTerm(3, 1, 2)
        };

        PolynomialTerm[] poly2 = {
                new PolynomialTerm(4, 1, 1),
                new PolynomialTerm(-1, 0, 2)
        };
        PolynomialTerm[] result = multiplyPolynomials(poly1, poly2);
        System.out.print("Result: ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) {
                System.out.print(" + ");
            }
        }
    }

    private static PolynomialTerm[] multiplyPolynomials(PolynomialTerm[] poly1, PolynomialTerm[] poly2) {
        int m = poly1.length;
        int n = poly2.length;
        PolynomialTerm[] result = new PolynomialTerm[m * n];

        for (int i = 0; i < m * n; i++) {
            result[i] = new PolynomialTerm(0, 0, 0);
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int coefficient = poly1[i].coefficient * poly2[j].coefficient;
                int exponentX = poly1[i].exponentX + poly2[j].exponentX;
                int exponentY = poly1[i].exponentY + poly2[j].exponentY;
                result[i * n + j] = new PolynomialTerm(coefficient, exponentX, exponentY);
            }
        }

        return result;
    }
}
