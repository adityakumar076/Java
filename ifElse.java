import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter A:");
        int a = sc.nextInt();
        System.out.println("Enter B:");
        int b = sc.nextInt();
        if(a>=b){
            System.out.println("A is largest of B");
        }
        else{
            System.out.println("B is Largest of A1");
        }

    }
    
}
