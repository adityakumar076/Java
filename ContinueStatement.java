public class ContinueStatement {
    public static void main(String[] args) {
        
        for( int i = 1; i<=10; i++){
            
            if (i==3) {
                continue; // Ignore 3 and continue with next step 
            }
            System.out.println(i);
        }
    }
}
