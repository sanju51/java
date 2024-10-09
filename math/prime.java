import java.util.*;
public class prime {
    public static void main(String[] args) {
        System.out.println("enter the number:");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        Boolean d=true;
        if (n==2){
            System.out.println("prime");
        }else{
        for( int i=2;i<=n;i++){
            if(n%i==0){
                d=false;
            }
        }}
        if(d==true){
            System.out.println("prime");
        }
else{
    System.out.println("not prime");
}


        
}
