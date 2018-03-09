public class Line2D extends Shape2D{

    public Point2D beginning;
    public Point2D ending;

    public Line2D(Point2D beginning, Point2D ending) {
        this.beginning = beginning;
        this.ending = ending;
    }

    @Override
    public double area() {
        return 0;
    }
}
