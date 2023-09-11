class q3{
    public static void sub(int number[]){
       int  ms=Integer.MIN_VALUE;
        int cs=0;
        int perfix[]=new int[number.length];
        perfix[0]=number[0];
        for(int i=1;i<perfix.length;i++){
            perfix[i]=perfix[i-1]+number[i];
        }
        for(int i=0;i<number.length;i++){
            for(int j=i;j<number.length;j++){
                cs= i==0 ? perfix[j]:perfix[j]-perfix[i-1];
                if(ms<cs){
                    ms=cs;
                }   
            }
        }
        System.out.println("Max  sum is:"+ms);
    }
 
    
    public static void main(String []args){
        int number[]={1,2,3,4,5};
        sub(number);
    }
}
