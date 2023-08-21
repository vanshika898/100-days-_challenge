class q1 {
    public static void main(String args[]) {
        int a=0;
        int b=1;
        int c;
        System.out.println(a);
        
        int i=1;
         // Initialize y
        while (i < 10) { // Adjust loop condition to prevent infinite loop
            c = a + b;
            System.out.println(c); // Print the value of c
            a = b;
            b = c;
            i++;
        }
    }
}
