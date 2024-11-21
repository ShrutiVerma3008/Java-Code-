import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class Iteratorr
{
    public static void main(String[] args) {
        ArrayList l1=new ArrayList();
        l1.add("kans");
        l1.add(88);l1.add(null);l1.add(true);l1.add(74);
        System.out.println(l1);
        System.out.println("Iterator...");

        Iterator iter= l1.iterator();
        while (iter.hasNext()){
            Object obj=iter.next();
            
            l1.set(3,4000);
            System.out.println(obj);
        }
        System.out.println(l1);
        System.out.println("Forward ...");
        ListIterator lister=l1.listIterator();

        while(lister.hasNext()){
            Object obj2=lister.next();
            System.out.println(obj2);
        }
        System.out.println("Back....");
        while (lister.hasPrevious()){
            Object obj2=lister.previous();
            System.out.println(obj2);
        }
        ArrayList<String> list3=new ArrayList<String>();
        list3.add("32");
        System.out.println(list3);
        list3.isEmpty();


        ArrayList<Integer> i1=new ArrayList<Integer>();
        i1.add(34);
        i1.add(342);
        i1.add(32);
        i1.add(78);
        i1.add(99);

        ArrayList<Integer> i2=new ArrayList<Integer>();
        i2.add(33);
        i2.add(67);
        i2.add(34);
        i2.add(99);
        i2.add(32);
        ArrayList<Integer> i3=new ArrayList<Integer>();
        i2.add(23);
        i2.add(27);
        i2.add(34);
        i2.add(99);
        i2.add(32);
        System.out.println("I1 : "+i1);
        System.out.println("I2 : "+i2);

        System.out.println(i1.retainAll(i2));
        System.out.println("After Retaining "+i1);
        System.out.println(i2.containsAll(i3));
        System.out.println("After Containing "+i1);


        Collections.sort(i1);
        System.out.println(i1);
        i1.addAll(i2);
        Collections.sort(i1);
        System.out.println(i1);
        System.out.println(Collections.binarySearch(i1,67));
        System.out.println(Collections.binarySearch(i1,699));
        System.out.println(Collections.binarySearch(l1,6));

    }


}