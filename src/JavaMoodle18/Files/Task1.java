package JavaMoodle18.Files;
import java.io.File;
import java.io.FileOutputStream;
import java.io.DataOutputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;

public class Task1 {
    public static void main(String args[]){
        try {
            File fileObj = new File("C:\\Users\\Gopi Venkat Krishna\\IdeaProjects\\2018_Moodle_Assignments\\src\\JavaMoodle18\\Files\\non-prime.txt");
            FileOutputStream fos = new FileOutputStream(fileObj);
            DataOutputStream dos = new DataOutputStream(fos);
            int value = 1;
            while (value <= 500) {
                if (!isPrime(value))
                    dos.writeInt(value);
                value++;
            }
            fos.close();
            dos.close();
        } catch (IOException io) { io.printStackTrace(); }
        System.out.println("operation success.");
    }

    static private boolean isPrime(int number){
        for (int value = 2; value < number; value++)
            if (number % value == 0)
                return false;
        return true;
    }
}
