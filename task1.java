import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your temprature :");
        double temp = sc.nextDouble();
        if(temp>=100){
            System.out.println("you have a fever");
        }
        else{
            System.out.println("you do not have a fever");
        }
    }
    
}
