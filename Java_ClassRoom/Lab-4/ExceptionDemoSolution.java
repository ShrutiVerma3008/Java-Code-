class ExceptionDemoSolution
{
    public static void  main(String [] args){
        try
        {
            String s = args[0];
            int i = Integer.parseInt(s);
            int j = i/(i-9);
            System.out.println("Value of j "+j);
        }
        catch(ArrayIndexOutOfBoundsException reference){
            System.out.println("Command line argument is not passed");
        }
        catch(NumberFormatException reference){
            System.out.println("Typecastig required");
        }
        catch(ArithmeticException reference){
            System.out.println("Divide by 0");
        }
        finally{
            System.out.println("Finally");
        }
        System.out.println("Main end");
    }
}