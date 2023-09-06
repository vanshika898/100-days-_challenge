class q5{
    public static  int linear(int marks[],int key){
        for(int i=0;i<marks.length;i++){
            if(marks[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main (String[]args){
        int marks[]={2,4,6,8,10,12,14,16};
        int key=10;
        int lin=linear(marks,key);
        if (lin==-1){
            System.out.println("Not found");
        }else{
            System.out.println("index is:"+lin);
        }
    }
}