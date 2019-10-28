package JavaMoodle18.Files;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;


public class Task4 {

    public static void main(String args[]){
        try{
            File fileObj = new File("C:\\Users\\Gopi Venkat Krishna\\IdeaProjects\\2018_Moodle_Assignments\\src\\JavaMoodle18\\Files\\data.txt");
            Scanner scanObj = new Scanner(new FileInputStream(fileObj));
            while(scanObj.hasNextLine()){
                String[] words = scanObj.nextLine().split(" ");
                for (String word: words)
                    System.out.println(word +":"+countFrequency(word, fileObj));
            }
            printUnique(fileObj);
            scanObj.close();
        } catch(Exception e) { e.printStackTrace(); }
    }

    static private int countFrequency(String word, File fileObj) throws IOException {
        int count = 0;
        Scanner sc = new Scanner(new FileInputStream(fileObj));
        while(sc.hasNextLine()){
            String[] words = sc.nextLine().split(" ");
            for (String str: words)
                if (str.equals(word))
                    count++;
        }
        sc.close();
        return count;
    }

    static void printUnique(File file) throws IOException{
        Scanner sc = new Scanner(new FileInputStream(file));
        System.out.println("\nPrinting Unique words....");
        while(sc.hasNextLine()) {
            String[] words = sc.nextLine().split(" ");
            for (String str : words)
                if (countFrequency(str, file) == 1)
                    System.out.println(str);
        }
    }

}
