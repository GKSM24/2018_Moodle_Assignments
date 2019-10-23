package JavaMoodle18.AbstractClasses;
import java.util.Scanner;

public class Menu {

    Shapes shapes[];
    int size;

    public Menu(int capacity){
        shapes = new Shapes[capacity];
        size = 0;
    }
    public static void main(String args[]){
        Menu menuObj = new Menu(5);
        menuObj.menu();
    }

    public void menu(){
        Scanner scan = new Scanner(System.in);
        do{
            System.out.println("Create an instance of");
            System.out.println("1.triangle\n2.quadrilateral\n3.circle\n4.exit");
            System.out.println("Select option");
            int option = scan.nextInt();
            switch (option){
                case 1:
                    if (size < shapes.length){
                        System.out.println("a.isosceles triangle\nb.equilateral triangle");
                        System.out.println("Select option");
                        char choice = scan.next().charAt(0);
                        scan.nextLine();
                        switch (choice){
                            case 'a':
                                shapes[size] = new IsoscelesTriangle(20, 10);
                                shapes[size].getData();
                                size++;
                                break;
                            case 'b':
                                shapes[size] = new EquilateralTriangle(20);
                                shapes[size].getData();
                                size++;
                                break;
                            default:
                                break;
                        }
                    }
                    break;
                case 2:
                    if (size < shapes.length){
                        System.out.println("a.rectangle\nb.square\nc.rhombus");
                        System.out.println("Select option");
                        char choice = scan.next().charAt(0);
                        scan.nextLine();
                        switch (choice){
                            case 'a':
                                shapes[size] = new Rectangle(20, 10);
                                shapes[size].getData();
                                size++;
                                break;
                            case 'b':
                                shapes[size] = new Square(20);
                                shapes[size].getData();
                                size++;
                                break;
                            case 'c':
                                shapes[size] = new Rhombus(30,40);
                                shapes[size].getData();
                                size++;
                            default:
                                break;
                        }
                    }
                    break;
                case 3:
                    if (size < shapes.length){
                        shapes[size] = new Circle(45.5);
                        shapes[size].getData();
                        size++;
                    }
                    break;
                case 4:
                    System.exit(0);
            }
        }while(true);
    }
}