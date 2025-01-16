import java.util.Scanner;

public class containertwopointers {
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
        System.out.println("maximum element is "+s);}
        public static int maximum(int[] height) {
            int max=0;
            int lp=0;
            int rp=height.length-1;
            while(lp<rp){
                int w=rp-lp;
                int ht=Math.min(height[rp],height[lp]);
                int area=w*ht;
                max=Math.max(area,max);
                if (height[lp] < height[rp]) {
                    lp++;
                } else {
                    rp--;
                }
            }
            return max;
        }


    
    
}
