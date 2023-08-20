class q3{
    public static float sum_average(int x,int y,int z){
     float sum=x+y+z;
     System.out.println("sum is :"+sum);
     float average=sum/3.0f;
     System.out.println("Average is:"+average);
     return average;
    }
    public static void main (String[]args){
     System.out.println(sum_average(2,3,4));
    }
}