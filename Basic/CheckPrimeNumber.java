import java.util.Scanner;

public class CheckPrimeNumber {
    //those are number is divisible by 1 or same number call prime numbers.
    // And other numbers are Composite Numbers
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();

        boolean isPrime = true;
        for(int i =2; i<=n-1; i++){
            if (n % i ==0) {
                isPrime = false;
            }
        }
        if (isPrime == true) {
            System.out.println("n is prime");
        }
        else{
            System.out.println("n is not prime");
        }

    }
    
}
