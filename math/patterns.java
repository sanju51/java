import java.util.*;
public class patterns {
    public static void main(String[] args) {
       int n,m;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the m value");
        m=sc.nextInt();
        char ch='A';
        for(int i=0;i<=m;i++){
            for(int j=1;j<=m-i;j++){
                System.out.print(ch);
                ch++;
        }System.err.println("");
    }
    }}
