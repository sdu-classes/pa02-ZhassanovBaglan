import java.util.*;

public class Main {
	public static void main(String[] args){
		Circle circle = new Circle();
		System.out.println(circle.toString());
	}
}

class Shape{
	String color = "red";
	boolean filled = true;
	Shape(){};
	Shape(String color, boolean filled){}
	public String getColor(){return this.color;}
	public boolean isFilled(){return this.filled;}
	public void setColor(String color){this.color = color;}
	public void setFilled(boolean filled){this.filled = filled;}
	@Override
	public String toString(){return "Shape[color=" + this.color + ",filled=" + this.filled + "]";}
}

class Circle extends Shape{
	private double radius = 1;
	Circle(){}
	Circle(double radius){}
	Circle(double radius, boolean filled, String color){}
	public double getRadius(){return this.radius;}
	public void setRadius(double radius){this.radius = radius;}
	public double getPerimeter(){return Math.PI * radius * 2;}
	@Override
	public String toString(){return "Shape[color=" + super.getColor() + ",filled=" + super.isFilled() + ",radius=" + this.radius + "]";}
}

class Rectangle extends Shape{
    double width = 1.0;
    double length = 1.0;

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

    double getWidth() {
        return width;
    }

    void setWidth(double width) {
        this.width = width;
    }

    double getLength() {
        return length;
    }

    void setLength(double length) {
        this.length = length;
    }

    double getArea(){
        return width * length;
    }

    double getPerimeter(){
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
        super.color = color;
        super.filled = filled;
    }

    double getSide(){
        return super.width;
    }

    void setSide(double side){
        super.width = super.length = side;
    }

    void setWidth(double side){
        super.width = super.length = side;
    }

    void setLength(double side){
        super.width = super.length = side;
    }

    @Override
    public String toString(){
        return "Square["+super.toString()+"]";
    }
}
