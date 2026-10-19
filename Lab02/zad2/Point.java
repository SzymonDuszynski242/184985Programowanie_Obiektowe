public class Point {
    double x;
    double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double distance(Point otherPoint){
        double dx = this.x - otherPoint.x;
        double dy = this.y - otherPoint.y;
        return Math.hypot(dx,dy);

    }
}
