package JavaMoodle18.Files;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Task5 {

    public static void main(String args[]){
        try{
            FileReader fr = new FileReader("C:\\Users\\Gopi Venkat Krishna\\IdeaProjects\\2018_Moodle_Assignments\\src\\JavaMoodle18\\Files\\data.txt");
            int value;
            while ((value = fr.read()) != -1){
                int charFreq = charCount((char)value);
                System.out.println((char)value+":"+charFreq);
                System.out.println("percentage of character '"+(char)value+"' :"+(((double)charFreq/totalCharCount())* 100));
            }
            fr.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    static int totalCharCount() throws IOException {
        FileReader fr = new FileReader("C:\\Users\\Gopi Venkat Krishna\\IdeaProjects\\2018_Moodle_Assignments\\src\\JavaMoodle18\\Files\\data.txt");
        int count = 0, value;
        while ((value = fr.read()) != -1){
            if (Character.isLetter((char)value))
                count++;
        }
        return count;
    }

    static int charCount(char c) throws IOException {
        FileReader fr = new FileReader("C:\\Users\\Gopi Venkat Krishna\\IdeaProjects\\2018_Moodle_Assignments\\src\\JavaMoodle18\\Files\\data.txt");
        int count = 0, value;
        while ((value = fr.read()) != -1){
            if (c == (char)value)
                count++;
        }
        return count;
    }
}
