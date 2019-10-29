package JavaMoodle18.Collections;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

public class Task2 {
    public static void main(String args[]){
        Hashtable<Integer, String> studentDetails = new Hashtable<>();
        studentDetails.put(101, "Hari");
        studentDetails.put(102, "Narayan");
        studentDetails.put(103, "vishnu");
        studentDetails.put(104, "sri");
        Enumeration<Integer> itr = studentDetails.keys();
        while (itr.hasMoreElements()) {
            int key = itr.nextElement();
            System.out.println(key + " "+ studentDetails.get(key));
        }

        System.out.println("Enter the registration number to remove student details: ");
        int number = new Scanner(System.in).nextInt();
        if (studentDetails.containsKey(number))
            studentDetails.remove(number);

        itr = studentDetails.keys();
        while (itr.hasMoreElements()) {
            int key = itr.nextElement();
            System.out.println(key + " "+ studentDetails.get(key));
        }
    }
}
