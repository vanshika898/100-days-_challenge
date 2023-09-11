class  q1{
    public static void  mxSum(int number[]){
        int maxSum=Integer.MIN_VALUE;
        int curentSum=0;
        for(int i=0;i<number.length;i++){
            for(int j=i;j<number.length;j++){
                curentSum=0;
                for(int k=i;k<=j;k++){
                    curentSum+=number[k];

                }
                System.out.println(curentSum);
                if(maxSum<curentSum){
                    maxSum=curentSum;
                }


            }
           // System.out.println("MAX SUM IS:"+maxSum);
        }
     System.out.println("MAX SUM IS:"+maxSum);
    }
    public static void main(String []args){

int number[]={1,2,3,4,5};
mxSum(number);



    }
}