class q4{
    //print reverse of the number
    public static void main(String []args){
        int n =3172005;
        int k;
        for(n=3172005;n>0;n/=10){
            k = n%10;
            System.out.print(k);
        }
    }
    }