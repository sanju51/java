
    
import java.util.Scanner;
public class cyclesort {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n =sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter "+n+" elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sort(arr);
        for(int i=0;i<n;i++){
            System.out.print(" "+arr[i]);
    
    }}
    public static void sort(int[] arr) {
        int i=0;
        while(i<arr.length){
            int c =arr[i]-1;
            if(arr[i]!=arr[c]){
                int temp = arr[i];
                arr[i] = arr[c];
                arr[c] = temp;
            }
            else{
                i++;
        }
}}}
