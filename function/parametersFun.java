import java.util.Scanner;

public class parametersFun {

public static int calcSum(int a, int b){//parameters or formal parameter
    
    int sum = a+b;
    return sum;
    // System.out.println(sum);
    } 


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int add = calcSum(a,b); // arguments or actual parameters
        System.out.println("your sum = "+add);
        
    }
    
}
