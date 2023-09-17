import java.util.*;
public class input_2Darray{
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
    }
}