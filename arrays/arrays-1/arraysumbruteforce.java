import java.util.Scanner;

public class arraysumbruteforce {
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
        for(int i=0;i<arr.length;i++){
            
            for(int j=i;j<arr.length;j++){
                int sum=0;
                
                for(int k=i;k<=j;k++){
                    sum+=arr[k];
                    
                    
                }if(max<sum){
                    max=sum;
                }
                System.out.println(sum);
            }
        }System.out.println("maximum sum is:"+max);
    }
}
