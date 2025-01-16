import java.util.Scanner;

public class containerbruteforce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n =sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter "+n+" elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
       int s= maximum(arr);
       System.out.println("maximum element is "+s);
}
public static int maximum(int[] arr) {
    int max=0;
    for(int i=0;i<arr.length;i++){
      
        for(int j=i+1;j<arr.length;j++){
            int wd=j-i;
            int ht=Math.min(arr[i],arr[j]);
            int area=wd*ht;
            max=Math.max(max,area);
        }
    }
    return max;
}}
