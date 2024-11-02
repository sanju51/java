import java.util.Scanner;

public class kadane {
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
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            
            
                    sum+=arr[i];
                    if(sum<0){
                        sum=0;
                    }
                    
                max=Math.max(sum,max);
    }
        System.out.println("maximum sum is:"+max);
}
}
