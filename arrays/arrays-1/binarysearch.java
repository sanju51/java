import java.util.*;
public class binarysearch {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
            System.out.println("enter the element to search");
            int key=sc.nextInt();
        boolean rr=search(arr,key);
        System.out.println(rr);
    }
    public static boolean search(int[] arr,int key){
       int low = 0;
       int mid= -1;
       int high=arr.length-1;
       while(low<=high)
       {
            mid=(low+high)/2;
            if(key==arr[mid])
            {
                System.out.println("the element is found at position " +(mid+1));
                 return true;
            }
            else if(key<arr[mid])
             high=mid-1;
            else 
            low=mid+1;
       }
       return false;
    }

}
