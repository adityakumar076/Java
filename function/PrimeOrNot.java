import java.util.Scanner;

public class PrimeOrNot {

    public static boolean primeNumber(int n){



        // boolean isprime = true;
        //  for(int i = 2; i<=n; i++){
        //     if(n % i == 0){
        //         isprime = false;
        //         break;
        //     }
        //  }
        //  if (isprime = true) {
        //     System.out.println("The given number is prime ");
        //  }
        //  else{
        //     System.out.println("this is not prime");
        //  }

        //  return isprime;


    for(int i =  2; i<=Math.sqrt(n); i++){
        if (n % i ==0) {
            return false;
        }
        
    }
    return true;

    }

    public static int primeRange(int n){
        for(int i = 2; i<=n; i++){
            if (primeNumber(i)) {
                System.out.println(i + " ");
            }
        }
        // System.out.println();
        return n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number = ");
        int a = sc. nextInt();

    
        System.out.println(primeRange(a));
        // primeRange(a);
    }
    
}
