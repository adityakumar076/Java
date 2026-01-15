import java.util.Scanner;

public class printNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you number : ");
        int n = sc.nextInt();
        int number = 1;
        while (number<=n) {
            System.out.println(number + " ");
            number++;
        }
    }
    
}
