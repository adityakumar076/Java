import java.util.*;
public class largestNum {

    public static int printlargest(int arr[]){
        int largest = Integer.MIN_VALUE;

        for(int i = 0;i<arr.length;i++){
            if (largest < arr[i]) {
                largest = arr[i];
            }
        }
        return largest;

    }
    public static void main(String[] args) {
        
        // int arr[] ={1,2,3,5,6,3,2,2};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the element = ");
        int size = sc.nextInt();
        int arr[] = new int[7];
        System.out.println("Enter your array elements = ");
        for(int i = 0;i<size;i++){
            arr[i]=sc.nextInt();
        }


        System.out.println("Largest number of this array is = "+printlargest(arr));




    }
    
}
