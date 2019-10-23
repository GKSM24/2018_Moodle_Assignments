package JavaMoodle18.AbstractClasses;

public abstract class Shapes {
    public String shape = "";
    public abstract double area();
    public abstract double perimeter();
    public abstract void getData();
}

abstract class Triangle extends Shapes{
    public byte numberOfSides = 3;
    private double side1, side2, side3;

    public Triangle(){
        shape = "triangle";
        side1 = 0;
        side2 = 0;
        side3 = 0;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public Triangle(double s1, double s2, double s3){
        shape = "triangle";
        side1 = s1;
        side2 = s2;
        side3 = s3;
    }

    public double area(){
        double s = (side1+side2+side3)/2;
        return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
    }

    public double perimeter(){
        return side1+side2+side3;
    }

    public void getData(){
        System.out.println("The shape of triangle is "+shape);
        System.out.println("side 1= "+side1+" side 2= "+side2+" side 3= "+side3);
        System.out.println("Area = "+area()+" Perimeter = "+perimeter());
    }
}

class IsoscelesTriangle extends Triangle{

    public IsoscelesTriangle(){
        super();
        shape = "isosceles triangle";
    }

    public IsoscelesTriangle(double s1, double s2){
        super(s1, s1, s2);
        shape = "isosceles triangle";
    }

}

class EquilateralTriangle extends Triangle{

    public EquilateralTriangle(){
        super();
        shape = "equilateral triangle";
    }

    public EquilateralTriangle(double side){
        super(side,side,side);
        shape = "equilateral triangle";
    }

}

class Circle extends Shapes{

    private double radius;

    public Circle(){
        shape = "circle";
        radius = 0;
    }

    public double getRadius() {
        return radius;
    }

    public Circle(double r){
        radius = r;
        shape = "circle";
    }

    public double area(){
        return Math.PI * radius * radius;
    }

    public double perimeter(){
        return Math.PI * radius * 2;
    }

    public void getData(){
        System.out.println("The shape is "+shape);
        System.out.println("radius = "+radius);
        System.out.println("Area = "+area()+" Perimeter = "+perimeter());
    }
}

abstract class Quadrilateral extends Shapes{
    public byte numberOfSides = 4;

    public Quadrilateral(){
        shape = "quadrilateral";
    }
}

class Rectangle extends Quadrilateral{
    private double length, breadth;

    public Rectangle(){
        shape = "rectangle";
        length = 0;
        breadth = 0;
    }

    public double getLength() {
        return length;
    }

    public double getBreadth() {
        return breadth;
    }

    public Rectangle(double l, double b){
        length = l;
        breadth = b;
        shape = "rectangle";
    }

    public double area(){
        return length * breadth;
    }

    public double perimeter(){
        return 2*(length + breadth);
    }

    public void getData(){
        System.out.println("The shape of quadrilateral is "+shape);
        System.out.println("length = "+length+" breadth = "+breadth);
        System.out.println("Area = "+area()+" Perimeter = "+perimeter());
    }
}

class Square extends Quadrilateral{
    private double side;

    public Square(){
        shape = "square";
        side = 0;
    }

    public double getSide() {
        return side;
    }

    public Square(double s){
        shape = "square";
        side = s;
    }

    public double area(){
        return side * side;
    }

    public double perimeter(){
        return 4 * side;
    }

    public void getData(){
        System.out.println("The shape of quadrilateral is "+shape);
        System.out.println("Side = "+side);
        System.out.println("Area = "+area()+" Perimeter = "+perimeter());
    }
}

class Rhombus extends Quadrilateral{
    private double base, height;

    public Rhombus(){
        shape = "rhombus";
        base = 0;
        height = 0;
    }

    public Rhombus(double b, double h){
        shape = "rhombus";
        base = b;
        height = h;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    public double area(){
        return base * height;
    }

    public double perimeter(){
        return 4 * base;
    }

    public void getData(){
        System.out.println("The shape of quadrilateral is "+shape);
        System.out.println("Base = "+base+" Height = "+height);
        System.out.println("Area = "+area()+" Perimeter = "+perimeter());
    }
}