import java.util.*;
public class sub {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n =sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter "+n+" elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        array(arr);
    
    }
    public static void array(int[] arr) {
        for(int i=0;i<arr.length;i++){
            
            for(int j=i;j<arr.length;j++){
                
                for(int k=i;k<=j;k++){
                    
                    System.out.print(arr[k]+" ");
                    
                }System.out.println("");
            }
        }
    }

}
