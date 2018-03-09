public class Cube extends Shape3D {

    private int side;

    public Cube(int side) {
        this.side = side;
    }

    @Override
    public double volume() {
        return Math.pow(side, 3);
    }

    @Override
    public double area() {
        return 6 * Math.pow(side, 2);
    }
}
