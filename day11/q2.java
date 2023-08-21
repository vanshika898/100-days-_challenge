import java.util.Scanner;
public class q2{
    //Scanner sc=new Scanner(System.in);
    public static void name(int a,int b){
        int sum ;
        sum = a+b;
        System.out.println("sum is:"+sum);
    }
    public static int name1(int a,int b){
        int sum ;
        sum = a+b;
        return sum;
    }
    public static void name2(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number a:");
        int a =sc.nextInt();
        System.out.println("enter number b:");
        int b =sc.nextInt();
        int sum ;
        sum = a+b;
        System.out.println("sum is :"+sum);
    }
   public static void main(String []args)
{
    int a=name1(2,3);
    System.out.println(a);
    name2();
}

}