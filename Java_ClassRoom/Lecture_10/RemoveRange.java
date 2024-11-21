import java.util.ArrayList;
import java.util.List;

public class RemoveRange extends ArrayList
{
    public static void main(String[] args) {
        RemoveRange rd=new RemoveRange();
        rd.add(34);
        rd.add(67);
        rd.add(87);
        rd.add(88);
        rd.removeRange(0,2);
        System.out.println(rd);

        ArrayList l2=new ArrayList();
        l2.add(2);
        l2.add(435);
        l2.add(32);
        l2.add(4);

        Object all[]=l2.toArray();
        for (Object a: all)
        {
            System.out.println(a);
        }
        System.out.println(l2.indexOf(32));
        List sublist =l2.subList(2,4);
        System.out.println(sublist);


    }
}