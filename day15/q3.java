class q3{
    public static void main(String[]args){
        int sum=0;
        int n=1213;
        while(n>0){
            int last_digit=n%10;//find sum of digit in integer
            sum=sum+last_digit;
            n/=10;
        }

        System.out.println(sum);
    }
}