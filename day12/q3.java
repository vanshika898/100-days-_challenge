class q3{
    public static int sum(int a,int b){
        return a+b;//fuction overloading
    }
    public static int sum(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String[]args){
        int a =sum(2,3);
        System.out.println("sum is:"+a);
        int b =sum(2,3,4);
        System.out.println("sum is:"+b);
    }
}