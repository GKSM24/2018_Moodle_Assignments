package JavaMoodle18.Interface;

public interface Operator {
    int performOperation(int n1, int n2);
    String getOperation();
}

class Add implements Operator
{
    private String opString;
    public Add() {
        opString = "+";
    }
    public int performOperation(int num1, int num2) {
        return num1 + num2;
    }
    public String getOperation() {
        return opString;
    }
}

class Subtract implements Operator
{
    private String opString;
    public Subtract() {
        opString = "-";
    }
    public int performOperation(int num1, int num2) {
        return num1 - num2;
    }
    public String getOperation() {
        return opString;
    }
}

class Multiply implements Operator
{
    private String opString;
    public Multiply() {
        opString = "*";
    }
    public int performOperation(int num1, int num2) {
        return num1 * num2;
    }
    public String getOperation() {
        return opString;
    }
}

class Divide implements Operator
{
    private String opString;
    public Divide() {
        opString = "/";
    }
    public int performOperation(int num1, int num2) {
        return num1 / num2;
    }
    public String getOperation() {
        return opString;
    }
}

class Main{
    public static void main(String[] args){
        Operator op = new Divide();
        System.out.println(op.getOperation());
        System.out.println(op.performOperation(3,4));
        op = new Multiply();
        System.out.println(op.getOperation());
        System.out.println(op.performOperation(3,4));
        op = new Add();
        System.out.println(op.getOperation());
        System.out.println(op.performOperation(3,4));
    }
}