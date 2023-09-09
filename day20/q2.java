class q2{
    public static void subarray(int number[]){
        int ts=0;
        for(int i=0;i<number.length;i++){
            for(int j=i;j<number.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(number[k]+" ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total number of subarrary:"+ts);
    }
    public static void main (String args[]){
        int number[]={1,2,3,4};
        subarray(number);
    }
}