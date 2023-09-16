class trapped_water{
     public static int trapped_w(int height[]) {
        int n=height.length;
        //max water trapped in left side
       int leftmax[]=new int[n];
       leftmax[0]=height[0];
       for(int i=1;i<n;i++){
           leftmax[i]=Math.max(height[i],leftmax[i-1]);
       }
       //max water trappped in right side
       int rightmax[]=new int[n];
       rightmax[n-1]=height[n-1];
       for(int i=n-2;i>=0;i--){
           rightmax[i]=Math.max(height[i],rightmax[i+1]);
       }
       int trapped=0;
       for(int i=0;i<n;i++)
       {
           int waterlevel=Math.min(rightmax[i],leftmax[i]);
           trapped+=waterlevel-height[i];
       }
       return trapped;
    }
    public static void main(String[]args){
        int heigth[]={4,2,0,6,3,2,5};
        System.out.println("trapped water is:"+trapped_w(heigth));
    }
}
