package JavaMoodle18.ExceptionHandling.ChildPackage;
import java.io.*;
public class TestDriver {
    private static BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
    static String s;
    public static void main(String args[]){  // throws Exception
        try {
            int num = 0, demon = num / 0;
        } catch (ArithmeticException ae) { System.out.println(ae); }

        try {
            int x = Integer.parseInt(buf.readLine());
        } catch (IOException ie) {System.out.println(ie);}  catch (NumberFormatException nfe) {System.out.println(nfe);}

        try {
            int c[] = {1};
            c[42] = 99;
        } catch (ArrayIndexOutOfBoundsException aie) {System.out.println(aie);}


        System.out.println(s.toString());

        System.out.println("End of main");
    }

}
