import java.util.*;
import java.util.Scanner;
public class q7{
    public static void main (String[]args){
        // print largest of two number
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the First number");
        int a = sc.nextInt();
        System.out.println("enter the Second  number");
        int b = sc.nextInt();

        if (a>b){
            System.out.printf("%d is greater than %d",a,b);
        }
        else if(b>a){
             System.out.printf("%d is less than %d",a,b);
        }
        else {
             System.out.printf("%d is equal to %d",a,b);
        }
    }
}