public class Explicit
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
        try{
            test2(9);
            }
            catch(ClassNotFoundException ref){
                ref.printStackTrace();
            }
        System.out.println("Test1 end");
    }
    public static void test2(int i) throws ClassNotFoundException
    {
        System.out.println("test2 start");
            Class.forName("");
        System.out.println("Test2 end");
    }
}