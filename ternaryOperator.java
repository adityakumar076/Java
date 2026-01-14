import java.util.Scanner;

public class ternaryOperator {
    public static void main(String[] args) {
        int number = 1;
          

     //ternary Operator
     String type=(number%2==0) ? "even" : "odd";
     System.out.println(type);

     //Check if a student will Pass or Fail
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your marks");
    int marks = sc.nextInt();


    String report= marks>=33 ? "pass" : "fail";
    System.out.println(report);


    }

}
