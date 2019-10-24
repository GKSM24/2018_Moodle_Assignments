package JavaMoodle18.Interface;

interface MSITStudent{
    double getGPA();
}

interface MSITMentor{
    double getSalary();
}

public class TA implements MSITStudent, MSITMentor {
    String name, course_offered;
    double gpa, salary;
    TA(String name, String course, double gpa, double salary){
        this.name = name;
        course_offered = course;
        this.gpa = gpa;
        this.salary = salary;
    }

    @Override
    public double getGPA() {
        return gpa;
    }

    @Override
    public double getSalary(){
        return salary;
    }

    public static void main(String args[]){
        TA mentor = new TA("srujan", "java", 8.9, 10000);
        System.out.println(mentor.getSalary());
        System.out.println(mentor.getGPA());
    }
}
