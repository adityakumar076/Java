import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter something: ");
        String s = sc.nextLine();

        System.out.println("You entered: " + s);
    }
}
