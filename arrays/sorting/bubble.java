

import java.util.Scanner;

public class bubble {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n =sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter "+n+" elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sort(arr);
        for(int i=0;i<n;i++){
            System.out.print(" "+arr[i]);
    
    }}
    public static int[] sort(int arr[]){
        int n = arr.length;
        for(int i=0;i<n-2;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }
            }
        }
        return arr;
    }

    
}

//yrr mein nahi reh sakti hu tere binna mein kya bolu ye pyaar feelings ye sab ek tamasha nahi hai yrr pta nahi aise ajeeb sa fell ho raha hai bohot darr lag raha hai yaar yaar kabhi mat chodke jaana yrr mein loyal rahungi hamesha yrr .. tereko chodke ye dosti ye sab kuch bhi nahi hai yrr mein nhi reh sakti yrr i am sorry yaar mein tere har problem mein support karungi aur hamesha tere saath rahungi yaar maaf kardo yrr mujhe please i am sorry
