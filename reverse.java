import java.util.*;
public class reverse {
    public static void main(String[] args) {
        int a,d=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        a=sc.nextInt();
        while(a!=0){
            int r=a%10;
            d=(int)(d*10)+r;
            a=a/10;

        }
        System.out.println("the reverse of given number is:"+d);
    }
}
