class AA
{
    AA()
    {
        System.out.println("AA Const");
    }
    static{
        System.out.println("SIB-A");
    }
}

public class ManagerSIB {
    static{
        System.out.println("SIB-Main");
    }
    public static void main (String[] args)
    {
        System.out.println("Main Start");

        AA a = new AA();
        AA b = new AA();
    }
}
