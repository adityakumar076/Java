import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter your 2nd number : ");
        int num2 = sc.nextInt();
        System.out.println("Enter your Operator : ");
        char operator  = sc.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println(num1+num2);
                break;
            case '-':
                System.out.println(num1-num2);
                break;
            case '*':
                System.out.println(num1*num2);
                break;
            case '%':
                System.out.println(num1%num2);
                break;
            case '/':
                System.out.println(num1/num2);
                break;                
        
            default:
                System.out.println("Use real calculator");
                break;
        }


    }
    
}
