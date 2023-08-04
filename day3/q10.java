import java.util.Scanner;
public class q10{
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your marks");
        int a =sc.nextInt();
        String result;
        result = (a>=33)?"pass":"fail";
        System.out.println(result);

    }
}