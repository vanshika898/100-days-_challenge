import java.util.Scanner;
public class q2{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int a=sc.nextInt();
        for (int i=0;i<=a;i++){
        System.out.println("enter number untill multiple of 10") ;
        int b=sc.nextInt();
        if (b%10==0){
            break;}
           System.out.println(b) ;
        
    }
}}