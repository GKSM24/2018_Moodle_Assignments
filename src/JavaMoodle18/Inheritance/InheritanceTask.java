package JavaMoodle18.Inheritance;

import java.util.Scanner;

class Employee
{
    String name, surname, address;
    private double basicSalary;

    Employee(double basicSalary){

        this.basicSalary = basicSalary;
    }



    void display(){
        System.out.println(surname+" "+name+"\n"+address);
    }

    double getBasicSalary(){
        return basicSalary;
    }

}

class TemporaryEmployee extends Employee
{
    TemporaryEmployee( double basicSalary){
        super(basicSalary);
    }

    int number_of_days_worked;
    double calculateNetSalary(int number_of_days_in_month){
        return (number_of_days_worked * getBasicSalary())/number_of_days_in_month;
    }

}

class PermanentEmployee extends Employee
{
    PermanentEmployee(double basicSalary){
        super(basicSalary);
    }
    float providentfund;
    double calculateNetSalary(){
        return (getBasicSalary() + (getBasicSalary()*providentfund/100));
    }

}
class InheritanceTask
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String name, surname, address;
        double basicSalary;
        TemporaryEmployee temp[] = new TemporaryEmployee[4];
        PermanentEmployee permanent[] = new PermanentEmployee[4];
        System.out.println("Temporary Employee list");
        for (int index = 0; index < temp.length ;index++){
            System.out.println("\nEnter the details of Person "+(index +1));
            System.out.println("Enter the name");
            name = scan.nextLine();
            System.out.println("Enter the surname");
            surname = scan.nextLine();
            System.out.println("Enter the address");
            address = scan.nextLine();
            System.out.println("Enter the basic Salary");
            basicSalary = scan.nextDouble();
            temp[index] = new TemporaryEmployee(basicSalary);
            temp[index].name = name;
            temp[index].surname = surname;
            temp[index].address = address;
            temp[index].display();
            System.out.println(temp[index].getBasicSalary());
            System.out.println("Number of days worked:");
            temp[index].number_of_days_worked = scan.nextInt();
            scan.nextLine();
            System.out.println(temp[index].calculateNetSalary(30));
        }
        System.out.println("Permanent Employee list");
        for (int index = 0; index < permanent.length ;index++){
            System.out.println("\nEnter the details of Person "+(index +1));
            System.out.println("Enter the name");
            name = scan.nextLine();
            System.out.println("Enter the surname");
            surname = scan.nextLine();
            System.out.println("Enter the address");
            address = scan.nextLine();
            System.out.println("Enter the basic Salary");
            basicSalary = scan.nextDouble();
            permanent[index] = new PermanentEmployee(basicSalary);
            permanent[index].name = name;
            permanent[index].surname = surname;
            permanent[index].address = address;
            permanent[index].display();
            System.out.println(permanent[index].getBasicSalary());
            System.out.println("Enter the provident fund");
            permanent[index].providentfund = scan.nextFloat();
            scan.nextLine();
            System.out.println(permanent[index].calculateNetSalary());
        }
    }
}

