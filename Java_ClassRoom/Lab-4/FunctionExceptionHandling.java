public class FunctionExceptionHandling {
    public static void main(String [] args){
        int j = test(12);
        System.out.println("Value of j "+j);
    }
    public static int test(int i){
        int j = 0;
        try{
            j = i/(i-9);
        }
        catch(ArithmeticException ref){
            System.out.println("Arithmetic operations wrong");
        }
        finally{
            return j;
        }
    }
}
