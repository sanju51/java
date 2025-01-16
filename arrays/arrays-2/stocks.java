import java.util.Scanner;

public class stocks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n =sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter "+n+" elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int h=sellbuy(arr);
        System.out.println("max profit is "+h);
}
public static int sellbuy(int[] arr) {
    int max=Integer.MIN_VALUE;int profit=0;
    int buy=Integer.MAX_VALUE;
    for(int i=0;i<arr.length;i++){
        if(arr[i]<buy){
            buy=arr[i];
        }
        else{
           profit=arr[i]-buy;
           max=Math.max(max,profit);
        }}
        return max;
    }
}

