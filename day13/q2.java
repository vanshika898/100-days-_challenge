
class q2{
    public static String check(int a){
        if (a==2){
            return "it is a  prime number";

        }
        for(int i=2;i<=Math.sqrt(a);i++){
            if (a%i==0){
               return "not a prime number";
            }  
            //return "prime number" ;
        }
        return "prime number" ;
         
    }
    public static void main(String[]args){
       String a= check(13);
       System.out.println(a);
    }
}
