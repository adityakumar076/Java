import java.util.Scanner;

public class ifelseStatement {
    public static void main(String[] args) {
        System.out.println("Enter your Age :");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age >=18){
            System.out.println("Adult");

        }
        else{
            System.out.println("Not Adult");
        }
    }
    
}
