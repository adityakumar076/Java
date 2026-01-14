import java.util.Scanner;

public class switchStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Eneter your number [1-5]");
        int num = sc.nextInt();
        switch(num){
            case 1: 
                System.out.println("Aditya");
                break;
            case 2:
                System.out.println("Abhishek");
                break;
            case 3:
                System.out.println("vishal");
                break;
            case 4:
                System.out.println("Patanjali");
                break;
            case 5:
                System.out.println("DJ");
                break;
            default:
                System.out.println("this  is not present");                

        }
    }
}
