class q1{//getting smallest  and largest number in array
    public static void getlargest(int number[]){
        int largest =Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<number.length;i++){
            if(largest<number[i]){
                largest=number[i];
            }
            if(smallest>number[i]){
                smallest=number[i];
                
            }
        }
        System.out.println("largest numbers is:"+largest);
        System.out.println("smallest numbers is:"+smallest);
       
    }
    public static void main(String args[]){
        int number[]={1,3,7,8};
        getlargest(number);
    }
}