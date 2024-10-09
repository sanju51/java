import java.util.*;
public class primes {
    public static void primesinrange(int n)
    {
        for (int i=2;i<n;i++){
            if(isprime(i)){
            System.out.print(i+"");
            }}
    }
    public static boolean isprime(int a){
        for(int j=2;j<Math.sqrt(a);j++){
            if(a%j==0){
                return false;
        }
    }return true;
}
public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the number");
  int s=sc.nextInt();
  primesinrange(s);
}
}
