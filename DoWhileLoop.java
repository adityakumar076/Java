public class DoWhileLoop {
    public static void main(String[] args) {
        int counter = 1;
        do{
            System.out.println("Hello");
            counter++;
            if (counter == 5) {    // This is break statement of loops if condition is ture than the loop is break 
                break;
            }
        }while(counter <= 10);

        System.out.println("out of the loop");
    }
    
    
}
