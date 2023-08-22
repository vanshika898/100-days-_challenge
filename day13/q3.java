
class q3{
    public static boolean check(int a){//for printing the sequence
        if (a==2){
            return true ;

        }
        for(int i=2;i<=Math.sqrt(a);i++){
            if (a%i==0){
               return false;
            }  
            //return "prime number" ;
        }
        return true ;
         
    }
    public static void seq(int x){
        for(int i=2;i<=x;i++){
            if(check(i)){
                System.out.println(i);
            }
        }
    }
    public static void main(String[]args){
        seq(25);
    }
    }
