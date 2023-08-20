class q2{
    public static void star(){
        for(int i=1;i<=5;i++){
            for (int j=1;j<=5-i;j++){
                System.out.print("+"+" ");
            }
             System.out.println(); 
        }
        
    }
    public static void main (String [] args){
        star();
    }
}