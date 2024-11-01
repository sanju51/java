import java.util.Scanner;

public class arraysumprefix {
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
        int [] prefix =new int[arr.length];
        prefix[0]=arr[0];
        for(int h=1;h<prefix.length;h++){
            prefix[h]=prefix[h-1]+arr[h];
        }
        for(int i=0;i<arr.length;i++){
            
            for(int j=i;j<arr.length;j++){
                int sum=(i==0)?prefix[j]:prefix[j]-prefix[i-1];
                
                
                if(max<sum){
                    max=sum;
                }
                
            }
        }System.out.println("maximum sum is:"+max);
    }
}
