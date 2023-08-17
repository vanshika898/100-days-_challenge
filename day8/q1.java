class q1 {
    public static void main(String[] args) {
        int n=1908;
        int rev=0;
        for(int i=n;i>0;i/=10){
           int sum=i % 10;
           rev=(rev*10)+sum;

        }
      System.out.println(rev); 
    }
}
