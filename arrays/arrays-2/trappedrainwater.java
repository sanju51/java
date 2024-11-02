import java.util.*;

public class trappedrainwater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n =sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter "+n+" elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int h=find(arr);
        System.out.println("the height of the trapped water is "+h);
    
    }
    public static int find(int[] arr) {
        int n = arr.length;
        int[] left = new int[n];
        int[] right = new int[n];
        left[0] = arr[0];
        right[n - 1] = arr[n - 1];
        for (int i = 1; i < n; i++) {
            left[i] = Math.max(left[i - 1], arr[i]);
        }
        for (int i = n - 2; i >= 0; i--) {
            right[i] = Math.max(right[i + 1], arr[i]);
            }
            int max = 0;
            for (int i = 0; i < n; i++) {
               int wl=Math.min(left[i],right[i]);
               max+=wl-arr[i];
            }
            return max;
        }
    }
