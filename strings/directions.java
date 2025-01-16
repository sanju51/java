import java.util.Scanner;

public class directions {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
            String n=sc.nextLine();
            float h=directions(n);   
            System.out.println(h);
        
}
 public static float directions (String n){
    int x=0,y=0;
    for(int i=0;i<n.length();i++){
        char c=n.charAt(i);

        switch (c) {
            case 'N' -> y++;
            case 'S' -> y--;
            case 'E' -> x++;
            case 'W' -> x--;
            default -> {
            }
        }
}

int h=x*x;
int j=y*y;
    return (float)Math.sqrt(h+j);

 }
}
