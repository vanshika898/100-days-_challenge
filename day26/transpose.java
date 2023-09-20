class Transpose {
    public static void trans(int matrix[][]) {
        int row = matrix.length;
        int col = matrix[0].length;
        int transpose[][] = new int[col][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        print(matrix);
        System.out.println("Transpose:");
        print(transpose);
    }

    public static void print(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
           
        }
    }

    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 3}, {4, 5, 6}};
        trans(matrix);
    }
}
