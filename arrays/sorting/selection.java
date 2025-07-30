import java.util.Scanner;

public class selection {
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

    public static int[] sort(int []arr){
        // for(int i=0;i<arr.length;i++){
        //     int min =i;
        //     for(int j=i+1;j<arr.length;j++){
        //         if(arr[min]>arr[j]){
        //             min=j;
        //         }
        //     }
        //     int temp = arr[min];
        //     arr[min]=arr[i];
        //     arr[i]=temp;
        // }return arr;

        for(int i=arr.length-1;i>0;i--){
            int max=i;
            for(int j=i-1;j>=0;j--){
                if(arr[j]>arr[max]){
                    max=j;
                }
            }
            int t=arr[max];
            arr[max]=arr[i];
            arr[i]=t;

        }return arr;
    }
}
