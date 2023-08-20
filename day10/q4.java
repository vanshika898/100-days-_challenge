class q4{
    public static int factorial(int x){
        int fact=1;
        for(int i=1;i<=x;i++){
            fact*=i;

        }
        System.out.println("factorial is:"+fact);
        return fact;
    }
    public static void main(String[]args){
        factorial(4);

    }
    
}