public class ExceptionDuckig
{
    public static void main(String [] args)
    {
        System.out.println("Main start");
        test(9);
        System.out.println("Main End");
    }
    public static void test(int i)
    {
        System.out.println("test start");
        test1(9);
        System.out.println("Test end");
    }
    public static void test1(int i)
    {
        System.out.println("test1 start");
        test2(9);
        System.out.println("Test1 end");
    }
    public static void test2(int i)
    {
        System.out.println("test2 start");
        
        try{
        int j = i/(i-9);
        }
        catch(ArithmeticException ref){
            //System.out.println("Dividing by zero");
            ref.printStackTrace();
        }
        System.out.println("Test2 end");
    }
}