import java.util.Scanner;
public class q3{
    public static void main (String []args){
        Scanner sc =new Scanner(System.in);
      do{
        System.out.print("Enter your number:");
        int a =sc.nextInt();
        if (a%10==0){
            continue;
        }
        System.out.println("your number was:"+a);
      }while(true);





    }
}