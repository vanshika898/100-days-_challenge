import java.util.Scanner;
public class q2{
public static int factorial(int f){
    int fact = 1;
    for(int i=1;i<=f;i++){
        fact =fact*i;
    }
    return fact;
}
public static void binomial(){
    Scanner sc =new Scanner(System.in);
    System.out.println("enter the value of n:");
    int a = sc.nextInt();
    System.out.println("enter the value of r:");
    int b = sc.nextInt();

    int nfact=factorial(a);
    int rfact=factorial(b);
    int nrfact=factorial(a-b);
    float d =(float) nfact/(rfact*nrfact);
    System.out.println("binomial coefficient is:"+d);
}
public static void main(String[]args){
    binomial();
}
}