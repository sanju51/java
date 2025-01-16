import java.util.Scanner;

class semicolong {

    // Function to determine the final status of the package
    public static String solve(String statuses) {
        // Split the statuses by the delimiter ";"
        String[] statusList = statuses.split(";");
        
        // The final status is the last element in the list
        return statusList[statusList.length - 1];
    }

    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Take the statuses string input
        String statuses = scanner.nextLine();
        
        // Call the solve function and print the result
        System.out.println(solve(statuses));
        
        // Close the scanner
        scanner.close();
    }
}
