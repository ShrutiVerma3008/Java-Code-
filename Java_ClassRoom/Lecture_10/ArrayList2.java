import java.util.ArrayList;

public class ArrayList2
{
    public static void main(String[] args) {
        ArrayList l1=new ArrayList();
        l1.add("kans");
        l1.add(88);l1.add(null);l1.add(true);l1.add(74);
        System.out.println(l1);
        for (int i = 0; i < l1.size(); i++) {
            Object obj=l1.get(i);
            if (obj instanceof Integer){
                System.out.println(obj);
                Integer i1=(Integer) obj;
                System.out.println("Integer -> "+i1);
            }
            if (obj instanceof Float){
                Float f1=(Float)obj;
                System.out.println("Float -> "+f1);
            }
            if(obj instanceof String)
            {
                String s1=(String) obj;
                System.out.println("String -> "+s1);
            }
            if (obj instanceof Boolean){
                Boolean b1=(Boolean) obj;
                System.out.println("Boolean -> "+b1);
            }
        }

    }
}