import java.util.*;
public class largest {
    public static void maxmin(int[] arr){
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("maximum "+max);
        System.out.println("minimum "+min);
    }
// Source code is decompiled from a .class file using FernFlower decompiler.
public static void main(String[] args) {
    int n;
    
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of the array");
    n=sc.nextInt();
    int[] arr=new int[n];
    System.out.println("Enter the elements of the array");
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }maxmin(arr);
    }
        
}
