public class Ball extends Shape3D {

    private int radius;

    public Ball(int radius) {
        this.radius = radius;
    }

    @Override
    public double volume() {
        return 4/3 * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public double area() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }
}
