
import java.util.Scanner;
public class userInputOfArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Ask user for size of array
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt(); //size of array elements

        // Step 2: Create array of given size
        int[] arr = new int[n];

        // Step 3: Take input one by one
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();  // store input in array
        }

        // Step 4: Print the array to check
        System.out.println("You entered:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    
}
