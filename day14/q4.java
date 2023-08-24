/*Write a method named isEven that accepts an int argument. The method
should return true if the argument is even, or false otherwise. Also write a program to test your
method.*/
class q4{
    public static boolean test(int n){
        if (n%2==0){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[]args){
        System.out.println(test(13));
    }
}