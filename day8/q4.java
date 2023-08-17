import java.util.Scanner;
public class q4{
    public static void main (String []args){
        Scanner sc =new Scanner(System.in);
        int number=sc.nextInt();
        if (number==2){
            System.out.println("a is prime number");
        }else{
            boolean isPrime=true;
        for(int i=2;i<=number-1;i++){
            if(number%i==0){
                isPrime=false;
            }
        
        }
        if (isPrime==true){
            System.out.println("number is prime number");
        }
        else{
            System.out.println("number is not prime");
        }




        }



        }
        }