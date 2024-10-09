import java.util.*;

public class binomial {
    public static int operation(int n , int r){
        int s,f,k,l;
        s=n-r;
        f=fact(n);
        k=fact(r)*fact(s);
        l=f/k;
        return l;
  }
  public static int fact(int a){
    if(a==0||a==1){
        return 1;
    }
    else {
    return a*fact(a-1);
    }
}
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n,r;
        System.out.println("Enter the value of n");
        n=sc.nextInt();
        System.out.println("Enter the value of r");
        r=sc.nextInt();
        int result=operation(n,r);
        System.out.println(result);
    }
  
}
