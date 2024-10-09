import java.util.*;

public class decimal {
    public static void main(String[] args) {
        int n,d=0,k;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        n = sc.nextInt();
        while(n!=0){
            k=n%2;
            d=d*10+k;
            n=n/2;

        } 
        System.out.println("the binary form of given number :" +d);

    
}
}