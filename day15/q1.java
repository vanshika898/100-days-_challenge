class q1{
    public static void main(String []args){
        int bin=0;
        int n=112;
        int original=n;
        //boolean ispardiom=false;
        while(n>0){
            int last_digit=n%10;
            bin=(bin*10)+last_digit;
            //ispardiom=true;


             
             n/=10;
        }
        if(bin == original){
            System.out.println("it is palidrome number");

        }
        else{
            System.out.println("it not palidrome number");
        }
    }
}