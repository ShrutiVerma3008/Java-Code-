public class Explicit2{
    public static void main(String [] args)throws ClassNotFoundException{
        System.out.println("Main start");
        test(9);
        System.out.println("Main End");
    }
    public static void test(int i) throws ClassNotFoundException{
        System.out.println("test start");
        test1(9);
        System.out.println("Test end");
    }
    public static void test1(int i)throws ClassNotFoundException{
        System.out.println("test1 start");
        test2(9);
        System.out.println("Test1 end");
 }
    public static void test2(int i) throws ClassNotFoundException{
        System.out.println("test2 start");
            Class.forName("");
        System.out.println("Test2 end");
    }
}