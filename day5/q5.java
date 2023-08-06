import java.util.Scanner;
public class q5{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k,l=0;
       while(n>0){
        k=n%10;
        l=(l*10)+k;
        
        n/=10;
       }

        System.out.println(l);
        
        }
    } 
    