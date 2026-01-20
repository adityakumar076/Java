import java.util.Scanner;

public class factorialOfNumber {

    public static int  factorial(int n){
        int fact = 1;
        for(int i =  1; i<=n;i++){
            fact*=i;
        }
        // System.out.println("Your factorial of this number = "+fact);
        return fact;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number = ");
        int n = sc.nextInt();
        int f = factorial(n);
        System.out.println("This is your factorial = "+f);
        
    }
    
}
