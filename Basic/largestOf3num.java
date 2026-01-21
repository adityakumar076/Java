import java.util.Scanner;
public class largestOf3num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A :");
        int a= sc.nextInt();
        System.out.println("Enter B :");
        int b = sc.nextInt();
        System.out.println("Enter C :");
        int c = sc.nextInt();
        if(a>=b && a>=c){
            System.out.println("A is largest number" +a);
        }
        else if(b>=c && b>=a){
            System.out.println("B is largest number "+b);
        }
        else{
            System.out.println("C is largest number "+c);
        }

    }
    
}
