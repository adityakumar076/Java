import java.util.*;
public class BinarySearch {

    public static int binsearch(int arr[], int targrt){
        int st = 0;
        int end = arr.length-1;

        while (st <= end) {
            int mid = (st+end)/2;

            if (targrt > arr[mid]) {
                st = mid+1;
            }
            else if (targrt < arr[mid]) {
                end = mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {

        int arr[] = {1,2,4,5,6,7,8,10};
        int target = 6;
        // System.out.println("Your target = "+binsearch(arr, target));
        int index = binsearch(arr, target);

        if (index !=-1) {
            System.out.println("YOUR TARGET INDEX : "+index);
        }
       else {
        System.out.println("not found");
       }
    }
    
}
