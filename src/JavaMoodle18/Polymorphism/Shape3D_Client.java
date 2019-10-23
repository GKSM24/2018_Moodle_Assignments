package JavaMoodle18.Polymorphism;

// Super class Shape3D: for three-dimensional shapes.
class Shape3D {
    public String shape = "";
    public double getArea(){  return 0.0;}
    public double getVolume(){  return 0.0;}
    public String toString(){ return " ";}
    public boolean equals(Object obj){ return false;}
    public void printInfo(){}
}

// Class SquarePyramid. extends Shape3D
// Represents a pyramid with a square as its base.
class SquarePyramid extends Shape3D {
    private double length;
    private double height;

    public SquarePyramid() {
        shape = "square pyramid";
        length = 0;
        height = 0;
    }
    public SquarePyramid(double l, double h) {
        shape = "square pyramid";
        length = l;
        height = h;
    }

    public double getLength() {
        return length;
    }

    public double getHeight() {
        return height;
    }

    public double getArea() {
        return length * (length + Math.sqrt(length * length + 4 * height * height));
    }

    public double getVolume() {
        return length * length * height / 3.0;
    }

    public String toString() {
        return "For this square pyramid the base has the length = " + length + " and the height = " + height;
    }

    public boolean equals(Object obj) {
        if (obj instanceof SquarePyramid) {
            SquarePyramid other = (SquarePyramid) obj;
            return length == other.length && height == other.height;
        }
        else
            return false;
    }
    public void printInfo(){
        System.out.println("This is "+shape+". Area = "+getArea()+". Volume = "+getVolume());
        System.out.println("Output calling the method printInfo - polymorphism at work!");
    }
}

// Class Sphere. extends Shape3D
// Represents a perfect sphere.

class Sphere extends Shape3D {
    private double radius;

    public Sphere() {
        shape = "sphere";
        radius = 0;
    }

    public Sphere(double r) {
        shape = "sphere";
        radius = r;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return  4 * Math.PI * Math.pow(radius, 2);
    }

    public double getVolume() {
        return  4.0 * Math.PI * Math.pow(radius, 3) / 3.0;
    }

    public String toString() {
        return "The radius of this sphere = " + radius;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Sphere)
        {
            Sphere other = (Sphere) obj;
            return radius == other.radius;
        }
        else{ return false; }

    }

    public void printInfo(){
        System.out.println("This is "+shape+". Area = "+getArea()+". Volume = "+getVolume());
        System.out.println("Output calling the method printInfo - polymorphism at work!");
    }
}

// Class RectangularPrism. extends Shape3D
// Represents a three-dimensional rectangular shape.

class RectangularPrism extends Shape3D {
    private double length;
    private double width;
    private double height;

    public RectangularPrism() {
        shape = "rectangular prism";
        length = 0;
        width = 0;
        height = 0;
    }

    public RectangularPrism(double l, double w, double h) {
        shape = "rectangular prism";
        length = l;
        width = w;
        height = h;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getArea() {
        return 2 * (length * width + width * height + length * height);
    }

    public double getVolume() {
        return length * width * height;
    }

    public String toString() {
        return "For this rectangular prism the base has the length = " + length + " and the width = " + width + "\nThe height of the prism = " + height;
    }

    public boolean equals(Object obj) {
        if (obj instanceof RectangularPrism) {
            RectangularPrism other = (RectangularPrism) obj;
            return length == other.length && height == other.height && width == other.width;
        }
        else
            return false;
    }
    public void printInfo(){
        System.out.println("This is "+shape+". Area = "+getArea()+". Volume = "+getVolume());
        System.out.println("Output calling the method printInfo - polymorphism at work!");
    }
}

// Class Cube, subclass of RectangularPrism
// Represents a perfect cube.

class Cube extends RectangularPrism {
    public Cube() {
        super();
        shape = "cube";
    }

    public Cube(double size) {
        super(size,size,size);
        shape = "cube";
    }

    public String toString() {
        return "For this cube all sides = " + super.getLength();
    }
}



//Client to test them all!
public class Shape3D_Client {
    public static final int MAX = 6;
    public static void main(String[] args) {
        Shape3D[] shapes = new Shape3D[MAX];
// create all objects withe respective consturctors
        shapes[0] = new SquarePyramid(37, 20);
        shapes[1] = new Sphere(20);
        shapes[2] = new RectangularPrism(10,20,37);
        shapes[3] = new Cube(10);

// display
        for (int index=0; index<4 ;index++ )
        {
            shapes[index].printInfo();
            System.out.println(shapes[index]);
            System.out.println("Area = "+shapes[index].getArea()+". Volume = "+shapes[index].getVolume());
            System.out.println("-------------------");
        }

    }
}