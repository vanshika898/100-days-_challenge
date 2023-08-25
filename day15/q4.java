class q4 {
    public static void main(String[] args) {
        int row = 5;
        int column = 6;
        for (int i = 0; i <= row; i++) {
            for (int j = 0; j <= column; j++) {
                if (i == 0 || i == row || j == 0 || j == column) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
