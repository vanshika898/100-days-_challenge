class PolyTerm {
    int coef;
    int expoX;
    int expoY;

    public PolyTerm(int coef, int expoX, int expoY) {
        this.coef = coef;
        this.expoX = expoX;
        this.expoY = expoY;
    }

    public String toString() {
        return coef + "x^" + expoX + "y^" + expoY;
    }
}

public class q4 {
    public static void main(String[] args) {
        PolyTerm[] poly1 = {
                new PolyTerm(2, 2, 1),
                new PolyTerm(3, 1, 2)
        };
        PolyTerm[] poly2 = {
                new PolyTerm(4, 1, 1),
                new PolyTerm(2, 0, 2)
        };
        PolyTerm[] result = multiplyPolyTerms(poly1, poly2);
        System.out.print("Result: ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) {
                System.out.print(" + ");
            }
        }
    }

    private static PolyTerm[] multiplyPolyTerms(PolyTerm[] poly1, PolyTerm[] poly2) {
        int m = poly1.length;
        int n = poly2.length;
        PolyTerm[] result = new PolyTerm[m * n];

        for (int i = 0; i < m * n; i++) {
            result[i] = new PolyTerm(0, 0, 0);
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int coef = poly1[i].coef * poly2[j].coef;
                int expoX = poly1[i].expoX + poly2[j].expoX;
                int expoY = poly1[i].expoY + poly2[j].expoY;
                result[i * n + j] = new PolyTerm(coef, expoX, expoY);
            }
        }

        return result;
    }
}
