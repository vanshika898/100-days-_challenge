import java.util.Scanner;
class q2{
    public static void main (String[]args){
        Scanner sc =new Scanner(System.in);
        int num=sc.nextInt();
        int fact=1;
        for(int i=1;i<=num;i++){
            fact=fact*i;

        }
        System.out.println("factorial of number is:"+fact);
    }
}