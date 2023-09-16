class q2{
    public static void hollow_rhom(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
               if(i==1||j==1||j==n||i==n){
                System.out.print("*");
               }else{
                System.out.print(" ");
               }
            }
            System.out.println();
        }
    }
   public static  void main(String[]args){
    hollow_rhom(5);
   }




}