class q15{
    public static void main(String[]args){
        int a=2016;
        if ((a%4==0 && a%100!=0 )|| a%400==0){
            System.out.println("leap year");// code for finding it is leap year ot not

        }
        else{
            System.out.println("not leap year");
        }
    }
}