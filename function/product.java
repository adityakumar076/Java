import java.util.Scanner;

public class product {

    public static int multiply(int num1, int num2){
        int product = num1*num2;
        return product;
    }

public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr number A = ");
        int a = sc.nextInt();
        System.out.println("Enter number B = ");
        int b = sc.nextInt();
        int multi = multiply(a, b);
        System.out.println("Your munltipication is = "+multi);
        
    }
    
}
