
package zad1;


import javafx.scene.Group;
import javafx.scene.paint.Color;


public class Rectangle {
    private Point aPoint;
    private double width;
    private double height;
    
    public Rectangle(Point aPoint, double width, double height)
    {
        setHeight(height);
        setWidth(width);
        setaPoint(aPoint);
    }
    
    public Rectangle (){
        this(new Point(),0,0);
    }
    
    public Rectangle(Rectangle rect){
        this(rect.aPoint, rect.width, rect.height);
    }

    public Point getaPoint() {
        return aPoint;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setaPoint(Point aPoint) {
        this.aPoint = aPoint;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    public void draw(Group group){
        int[] pointACoord=aPoint.getCord();
        
        javafx.scene.shape.Rectangle rect=
                new javafx.scene.shape.Rectangle(pointACoord[0],pointACoord[1],width,height);
        rect.setStroke(Color.RED);
        rect.setFill(null);
        group.getChildren().add(rect);
    }
    
    public String toString(){
        return String.format("Rectangle(A%s, width= %.2f height= %.2f", aPoint, width, height);
    }
}
