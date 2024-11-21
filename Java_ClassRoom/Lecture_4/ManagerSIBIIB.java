class AA
{
    AA()
    {
        System.out.println("AA Const");
    }
    static{
        System.out.println("SIB-A");
    }
    {
        System.out.println("IIB-AA");
    }
}

public class ManagerSIBIIB {
    static{
        System.out.println("SIB-Main");
    }
    public static void main (String[] args)
    {
        System.out.println("Main Start");
        // ManagerSIBIIB(){
        //     super();
        // }
        {
            System.out.println("IIB- MANAGER");
        }
        AA a = new AA();
    }
}
