import java.util.*;
public class linearsearch{
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
        System.out.println(rr);}
        public static boolean search(int[] arr,int key){
            for(int i=0;i<arr.length;i++){
                if(arr[i]==key)
               { System.out.println("the element is found at index:"+(i+1));
                return true ;}
            }return false;

        }


        }
    
    
