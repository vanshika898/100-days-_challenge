class printchar{
    public static void printl(String str){
        for(int i=0;i<str.length();i++){
             System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        String str ="vanshika Nigam";
        printl(str);
    }
}