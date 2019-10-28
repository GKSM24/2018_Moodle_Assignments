package JavaMoodle18.Files;
import java.io.*;
import java.util.Arrays;


public class Task2 {

    public static void main(String args[]){
        int arr[] = new int[1];
        try {
            File fileObj = new File("C:\\Users\\Gopi Venkat Krishna\\IdeaProjects\\2018_Moodle_Assignments\\src\\JavaMoodle18\\Files\\non-prime.txt");
            FileInputStream fis = new FileInputStream(fileObj);
            DataInputStream dis = new DataInputStream(fis); // throws an EOFException when reached end of file.
            try {
                while (true) {
                    arr[arr.length-1] = dis.readInt();
                    arr = Arrays.copyOf(arr, arr.length+1);
                }
            }catch (EOFException eof) { System.out.println("Reached end of the file"); }
            System.out.println("read operation success.");
            fis.close();
            dis.close();
            DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileObj));
            for (int index = 0; index < arr.length - 1; index++)
                dos.writeChars(arr[index] +" = "+primeFactorization(arr[index])+"\n");
        }catch (IOException ioe) { ioe.printStackTrace(); } catch (Exception e) { System.out.println(e); }
        //System.out.println("operation success.");
    }

    static private String primeFactorization(int number){
        String factors = "";
        int primeFactors[] = new int[1];
        for (int value = 2; value < number; value++)
            if (number % value == 0 && isPrime(value)) {
                primeFactors[primeFactors.length - 1] = value;
                primeFactors = Arrays.copyOf(primeFactors, primeFactors.length + 1);
            }
        for (int index = primeFactors.length - 2, num = number; index > -1 && num != 1; index--){
            while (num % primeFactors[index] == 0){
                num /= primeFactors[index];
                factors += primeFactors[index] + "x";
            }
            if (num == 1)
                factors = factors.substring(0, factors.length()-1);
        }
        return factors;
    }

    static private boolean isPrime(int number){
        for (int value = 2; value < number; value++)
            if (number % value == 0)
                return false;
        return true;
    }
}
