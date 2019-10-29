package JavaMoodle18.Collections;
import java.util.Vector;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Enumeration;

public class Task1 {
    public static void main(String args[]){
        Vector <Integer> vec = new Vector<>();
        vec.addElement(20);
        vec.add(30);
        vec.add(40);
        vec.addElement(50);

        System.out.println("Iterating through Iterator interface....");
        Iterator<Integer> itr = vec.iterator();
        while (itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
        System.out.print("\n");

        System.out.println("Iterating forward through ListIterator interface....");
        ListIterator<Integer> listItr = vec.listIterator();
        while (listItr.hasNext()){
            System.out.print(listItr.next()+" ");
        }
        System.out.print("\n");

        System.out.println("Iterating backward through ListInterface interface...");
        while(listItr.hasPrevious()){
            System.out.print(listItr.previous()+" ");
        }
        System.out.print("\n");

        System.out.println("Iterating through Enumeration interface....");
        Enumeration<Integer> e = vec.elements();
        while (e.hasMoreElements()){
            System.out.print(e.nextElement()+" ");
        }
        System.out.print("\n");
    }
}
