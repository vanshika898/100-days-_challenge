class q2{//binary search
    public static int binary(int number[],int key)
    {
        int start=0,end=number.length-1;
        while(start<=end){
            int mid=start+end;
            if(number[mid]==key){
                return mid;
            }
            if(number[mid]<key){
                start=mid+1;

            }else{
                end=mid-1;
            }



        }
         return -1;
    }
    public static void main (String args[]){
        int number[]={1,23,57};
        int key=57;
        System.out.println("index is:"+binary(number,key));
    }
    
}