package zad2;

public class Rectangle {

    private double width;

    private double height;

    private String color;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
        color=null;
    }

    public Rectangle() {
        
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width=width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height=height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color=color;
    }

    public double getArea() {
        return width*height;
    }

    public double getPerimeter() {
       return 2*(width+height);
    }
}
