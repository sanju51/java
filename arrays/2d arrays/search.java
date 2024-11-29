import java.util.*;

public class search {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows and columna");
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] arr=new int[n][m];
        System.out.println("enter the matrix");
        for(int i=0;i<n;i++)
    {
        for(int j=0;j<m;j++){
            arr[i][j]=sc.nextInt();
        }
    }
    System.out.println("enter the search element");
    int key=sc.nextInt();
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(arr[i][j]==key){
                System.out.println("element found at position "+i +"and"+j);
                return;
            }
        }
    }
    System.out.println("not found");  
}}
