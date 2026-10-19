public class PointMain {
    public static void main(String[] args) {
        Point p1 = new Point(1, 4);
        Point p2 = new Point(3, 6);
        double wynik = p1.distance(p2);
        System.out.println("dystans wynosi: " + wynik);
    }
}
