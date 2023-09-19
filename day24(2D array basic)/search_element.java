import java.util.*;
public class search_element{
    public static boolean search(int matrix[][],int key){
        
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
               if(matrix[i][j]==key){
                System.out.println("found number at"+"("+i+","+j+")");
                return true;
               }
            }
        }
        System.out.println("Not found the number");
                return false;       
    }
    public static void main(String[]args){
        int matrix[][]=new int [3][3];
        int m=3,n=3;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=sc.nextInt();

        }
    }
    for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
}
search(matrix,3);
    }
}