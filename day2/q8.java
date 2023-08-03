import java.util.*;
import java.util.Scanner;

public class q8{
    public static void main (String[]args){
        int tax;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your yearly income");
        int income =sc.nextInt();
        if (income<500000){
            tax=income*0;
                System.out.println("you have to pay no tax");

        }
        else if (income >=500000&& income<=1000000){
            tax =(int)(income*0.10);
            System.out.printf("you have to pay %d",tax);
        }
        else if(income>100000){
            tax =(int)(income*0.20);
            System.out.printf("you have to pay %d",tax);

        }


    }
}