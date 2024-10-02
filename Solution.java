import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Locale;
public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        Locale usLocale=Locale.US;
        NumberFormat usFormatter=NumberFormat.getCurrencyInstance(usLocale);
        String us=usFormatter.format(payment);
        Locale indiaLocale = new Locale("en", "IN");
        NumberFormat indiaFormatter = NumberFormat.getCurrencyInstance(indiaLocale);
        String india = indiaFormatter.format(payment);
        Locale chinaLocale = Locale.CHINA;
        NumberFormat chinaFormatter = NumberFormat.getCurrencyInstance(chinaLocale);
        String china = chinaFormatter.format(payment);

        
        Locale franceLocale = Locale.FRANCE;
        NumberFormat franceFormatter = NumberFormat.getCurrencyInstance(franceLocale);
        String france = franceFormatter.format(payment);
        
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
