public class q4 {
    public static void main(String[] args) {
        int n = 5;
        
        // Upper part of the pyramid
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
           
            for (int j = 1; j <= ((2 * i) - 1); j++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
       
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= ((2 * i) - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
