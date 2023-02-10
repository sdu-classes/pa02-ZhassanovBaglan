package com.example.demo11;

public class Main {
    public static void main(String[] args){
        Circle circle = new Circle(5.5, "red", false);
        System.out.println(circle);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
        System.out.println(circle.getColor());
        System.out.println(circle.isFilled());
        System.out.println(circle.getRadius());

        Rectangle rectangle = new Rectangle(3.8, 2.5, "green", false);
        System.out.println(rectangle);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
        System.out.println(rectangle.getColor());
        System.out.println(rectangle.getLength());

        Square square = new Square(6.6);
        System.out.println(square);
        System.out.println(square.getArea());
        System.out.println(square.getColor());
        System.out.println(square.getSide());
    }
}

class Shape{
    private String color = "red";
    private boolean filled = true;
    Shape(){};
    Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }
    public String getColor(){return color;}
    public boolean isFilled(){return this.filled;}
    public void setColor(String color){this.color = color;}
    public void setFilled(boolean filled){this.filled = filled;}
    @Override
    public String toString(){return "Shape[color=" + color + ",filled=" + filled + "]";}
}

class Circle extends Shape{
    private double radius = 1;
    Circle(){}
    Circle(double radius){
        this.radius = radius;
    }
    Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }
    public double getRadius(){return this.radius;}
    public void setRadius(double radius) {this.radius = radius;}
    public double getArea(){return Math.PI * radius * radius;}
    public double getPerimeter(){return Math.PI * radius * 2;}
    @Override
    public String toString(){return "Circle["+super.toString()+",radius="+radius+"]";}
}

class Rectangle extends Shape{
    private double width = 1.0;
    private double length = 1.0;

    Rectangle(){}
    Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea(){
        return width * length;
    }

    public double getPerimeter(){
        return 2 * (width + length);
    }

    @Override
    public String toString(){
        return "Rectangle["+super.toString()+",width="+width+",length="+length+"]";
    }
}


class Square extends Rectangle {
    Square(){
        super();
    }

    Square(double side) {
        super(side, side);
    }

    Square(double side, String color, boolean filled) {
        super(side, side);
        super.setColor(color);
        super.setFilled(filled);
    }

    public double getSide(){
        return super.getWidth();
    }

    public void setSide(double side){
        super.setWidth(side);
        super.setLength(side);
    }

    public void setWidth(double side){
        super.setWidth(side);
        super.setLength(side);
    }

    public void setLength(double side){
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public String toString(){
        return "Square["+super.toString()+"]";
    }
}
