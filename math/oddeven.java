import java.util.*;
public class oddeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int od=0,ev=0;
        int []a=new int[5];
        for(int i=0;i<4;i++){
            a[i]=sc.nextInt();
            if((a[i]%2)==0){
              ev+=a[i];  
            }
            else{
                od+=a[i];
        }
    }
    System.out.println("even sum " +ev);
    System.out.println("odd sum " +od);
}
}