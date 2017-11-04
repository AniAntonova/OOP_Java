
package zad1;

import java.security.acl.Group;


public class Line {
    
    private Point aPoint;

    private Point bPoint;


    public Point getbPoint() {
        return new Point(bPoint);
    }

    public void setbPoint(Point bPoint) {
        if (bPoint!=null) {
           this.bPoint = new Point(bPoint); 
        }else {
            this.bPoint=new Point();
        }
    }

    public Point getaPoint() {
        return new Point(aPoint);
    }

    public void setaPoint(Point aPoint) {
        if (aPoint!=null) {
           this.aPoint = new Point(aPoint); 
        }else {
            this.aPoint=new Point();
        }

    }
    
    public void draw(Group group){
        int[] pointACoordinates = aPoint.getCord();
        int[] pointBCoordinates = bPoint.getCord();
        
        javafx.scene.shape.Line line=
                new javafx.scene.shape.Line(pointACoordinates[0],pointBCoordinates[1],
                                            pointACoordinates[1],pointBCoordinates[0]);
    }
}
