public class ExamResults {
    private int[] points;

    public ExamResults(int[] points) {
        this.points = points.clone();
    }

    public int[] getPoints() {
        return points.clone();
    }
}