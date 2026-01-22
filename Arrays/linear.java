import java.util.Scanner;

public class linear {

    public static int linearSearch(int arr[], int key) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == key) {
                return i; // return index if found
            }
        }
        return -1; // return -1 if not found
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);

        // // Take array size from user
        // System.out.print("Enter size of array: ");
        // int size = sc.nextInt();

        // int arr[] = new int[size];

        // // Input array elements
        // System.out.println("Enter " + size + " elements:");
        // for(int i = 0; i < size; i++) {
        //     arr[i] = sc.nextInt();
        // }

        // // Input key to search
        // System.out.print("Enter key to search: ");
        // int key = sc.nextInt();

        int arr[] = {1,2,3,4,5,6,7,8,9,7,64,4,34};
        int key = 10;

        // Call search function
        int result = linearSearch(arr, key);

        if(result != -1) {
            System.out.println("Key found at index: " + result);
        } else {
            System.out.println("Key not found in array");
        }
    }
}