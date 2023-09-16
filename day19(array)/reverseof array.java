class q3{
    public static void reverse(int number[]){
        int first=0,last=number.length-1;
        while(first<last){
            int temp=number[last];
            number[last]=number[first];
            number[first]=temp;

            first++;
            last--;
        }
        
    }
    public static void main(String[]args){
        int numbers[]={1,2,3,4,5,6,7,8};
       reverse(numbers);
       for(int i=0;i<numbers.length;i++){
        System.out.print(numbers[i]+" ");
       }
    }
    
}