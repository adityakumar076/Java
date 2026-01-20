import java.util.Scanner;

public class BinomialCoefficient {

    public static int  factorial(int n){
        int fact = 1;
        for(int i =  1; i<=n;i++){
            fact*=i;
        }
        // System.out.println("Your factorial of this number = "+fact);
        return fact;

    }

    public static int binomial(int n, int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_r_n = factorial(n-r);

        int bino = fact_n / (fact_r*fact_r_n);
        return bino;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N number = ");
        int a = sc.nextInt();
        System.out.print("Enter R number = ");
        int b = sc.nextInt();
        int c = binomial(a, b);
          
        System.out.println("This is your binomial coeffient = "+c);



        
    }
    
}
