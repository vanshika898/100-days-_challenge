class q1{
    public static boolean checkprime(int a){
        if (a==2){
            return true;
        }
        for(int i=2;i<=a-1;i++){
            if(a%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main (String []args){
        System.out.println(checkprime(45));
    }
}