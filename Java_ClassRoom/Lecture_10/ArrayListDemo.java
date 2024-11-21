import java.util.ArrayList;

public class ArrayListDemo
{
    public static void main(String[] args) {
        ArrayList list1=new ArrayList();
        list1.add(11);
        list1.add(22);
        list1.add(23);
        System.out.println(list1);
        int len=list1.size();
        System.out.println(len);
        ArrayList list2=new ArrayList();
        list2.add(43);
        list2.add(34);
        list2.add(44);
        list2.add(1,1111);
        System.out.println(list2);
        list2.addAll(list1);
        System.out.println(list2);
        list2.addAll(3,list1);
        System.out.println(list2);


        Object obj=list1.get(1);
        System.out.println("we got "+obj);
        for (int i = 0; i < list1.size(); i++)
        {
            System.out.println(list1.get(i));
        }
        System.out.println("before set"+list1);
        list1.set(2,1000);
        System.out.println(list1);
    }
}