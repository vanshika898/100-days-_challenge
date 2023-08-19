import java.util.Scanner;
class q1{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int even_sum=0;
        int odd_sum=0;
        System.out.println("enter number  you want to check:");
        int a=sc.nextInt();
        for (int i=1;i<=a;i++){
        System.out.println("enter numbers");
        int b=sc.nextInt();
        if (b%2==0){
            even_sum +=b;

        }else{
            odd_sum+=b;
        }
    }
    System.out.print("Odd sum is:"+odd_sum +"and even sum is :"+even_sum);
}}
