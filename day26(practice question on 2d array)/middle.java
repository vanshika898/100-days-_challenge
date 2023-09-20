class middle{
    public static void rowcol(int matrix[][]){
        int rowend =matrix[0].length;
        int sum=0;
        for(int j=0;j<rowend;j++){ 
                sum+=matrix[1][j];
            }
            
            
        
       System.out.println("sum of middle row in matrix is:"+sum); 
    }
	public static void main(String[] args) {
	    int matrix[][]={{1,2,3},{3,4,5},{6,7,8}};
		rowcol(matrix);
	}
}
