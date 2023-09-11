class q2{
    public static void kad(int number[]){
        int cs=0;
        int ms=Integer.MIN_VALUE;
        for(int i=0;i<number.length;i++){
            cs+=number[i];
            if(cs<0){
                cs=0;
            }
            ms=Math.max(cs,ms);
        }
        System.out.println("max sum is:"+ms);

    }
    public static void main(String[]args){
        int number[]={1,-1,3,-2};
        kad(number);
    }
}