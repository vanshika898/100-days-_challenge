class q4{
    public static void update(int marks[],int nonchangable){
        nonchangable=10;
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;

        }
    }
    public static void main (String[]args){
        int marks[]={1,2,3,4};
        int nonchangable=5;
        update(marks,nonchangable);
        System.out.println(nonchangable);
        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i]+" ");

        }
        System.out.println();
    }
}