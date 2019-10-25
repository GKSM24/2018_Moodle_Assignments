package JavaMoodle18.ExceptionHandling;

import JavaMoodle18.ExceptionHandling.ChildPackage.TestDriver;

public class Main {
    public static void main(String args[]){
        try {
            TestDriver.main(null);
        } catch (Exception e) { System.out.println(e); }

        finally{
            System.out.println("In finally block");
        }
    }
}
