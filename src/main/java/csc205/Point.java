package csc205;

public class Point {
    private double x;
    private double y;

    public Point() {
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setPoint(double x, double y) {
    }

    public double distance(Point b) {
       return Math.sqrt((b.x - x) * (b.x -  x)) + ((b.y - y) *(b.y - y));
                // It's the sqrt of x2-x1 to te second power
        // + y2 - y1 to the second power
    }
    public double getx()
    {
        return x;
    }
    public void setx(double x)
    {
        this.x = x;
    }

    public double gety()
    {
        return y;
    }

    public void sety (double y)
    {
        this.y = y;
    }
    public void shiftX(double n) {
        return ;

    }

    public void shiftY(double n)
    {

    }
}
