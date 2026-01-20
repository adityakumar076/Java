import java.util.Scanner;

public class Swap {

    public static void swapfunc(int num1 , int num2){
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("A = "+num1);
        System.out.println("B = "+num2);


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num A = ");
        int a = sc.nextInt();
        System.out.print("Enter B = ");
        int b = sc.nextInt();
        swapfunc(a, b);

    }
    
}
