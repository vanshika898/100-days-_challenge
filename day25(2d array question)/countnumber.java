class countnumber{
    public static void number(int arr[][]){
        int countn =0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                   if(arr[i][j]==7){
                    countn++;
                   }
                }
        }
    
   System.out.println("number of times 7 in matrix is:"+countn);
}
public static void main(String[]args){
    int matrix[][] = {{1, 7,7,8}, {5, 6, 7,8}};

    number(matrix);
}}