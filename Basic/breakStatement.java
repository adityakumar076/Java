import java.util.Scanner;

public class breakStatement {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);   

        for(;;){
            System.out.print("Enter your number : ");
            int n = sc.nextInt();
            if (n%10==0) {
                 break; //continue;
            }
            System.out.println(n);
            
        }
        System.out.println("This number is divied by 10");
    }
}
