public class factorial {

    private static int fact(int n){
        if(n==0)
        return 1;

        return n*fact(n-1);
    }
    public static void main(String[] args) {
        int n = 23;
        int g=fact(n);
        System.out.println(g);
}}
