public class PrintAbsoluteValue {
    public static void main(String[] args) {
        int x = -5;

        if (x < 0) { 
            //make sure {} group all the statments under statment
            System.out.println("I should negate X");
            x = -x;            
        }
        
        System.out.println(x);
    }
}