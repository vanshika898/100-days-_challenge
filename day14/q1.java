class q1{
    //binary to decimal conversion
    public static void bintodec(int binNum){
        int pow=0;
        int decNum=0;
        while(binNum>0){
         int last_digit=binNum%10;
         decNum=decNum+(last_digit*(int)(Math.pow(2,pow)));
         pow++;
         binNum/=10;
        }
        System.out.println("decimal of binary is:"+decNum);


    }
    public static void main(String[]args){
        bintodec(101);
    }
}