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
       return Math.sqrt(Math.pow((b.x - x), 2) + Math.pow((b.y - y),2));
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

    public void shiftX (double nA)
    {
    x = x + nA;

    }

    public void shiftY (double nB)
    {

    y = y +nB;
    }

    public void rotate (double theta)
    {
        double x1 = this.x;
        double y1 = this.y;

         this.x = (x1 * Math.cos(theta)) - (y1 * Math.sin(theta));
         this.y = (x1 * Math.sin(theta)) + (y1 * Math.cos(theta));
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
