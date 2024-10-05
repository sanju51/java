import java.util.*;
public class binary {
    public static void main(String[] args) {
        int pow=0,v=0,r;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
    while(n!=0){
        r=n%10;
        v=v+(int)Math.pow(2,pow)*r;
        pow++;
        n=n/10;
    }
    System.out.println(v);
}}
