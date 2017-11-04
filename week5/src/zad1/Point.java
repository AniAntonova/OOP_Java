
package zad1;

public class Point {
    
       private int[] cord;

    public Point() {
        this(new int[]{0,0});
    }

    public Point(int[] cord){
        setCord(cord);
    }
   public Point(Point point){
       this(point.cord);
   }
       
    public int[] getCord() {
        return new int[]{cord[0],cord[1]};
    }

    public void setCord(int[] cord) {
        if (cord != null && cord.length ==2) {
            this.cord=new int[cord.length];
            for (int i = 0; i < cord.length; i++) {
                this.cord[i]=cord[i];
            }
        }else this.cord=new int[2];
        this.cord=cord;
    }

    @Override
    public String toString(){
        return String.format("(%d %d", cord[0],cord[1]);
    }
}
