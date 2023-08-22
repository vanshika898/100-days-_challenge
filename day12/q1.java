import java.util.Scanner;
public class q1{
    public static void swap(int a,int b){
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println("swap value of a is:"+a);
        System.out.println("swap value of a is:"+b);
        
    }
    public static void main(String[]args){
        int a=2;
        int b=3;
        swap(a,b);

    }

}