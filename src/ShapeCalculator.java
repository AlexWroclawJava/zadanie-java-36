public class ShapeCalculator extends LineCalc implements Calc2D, Calc3D{

    @Override
    public double circleArea(Circle circle) {
        return circle.area();
    }

    @Override
    public double rectangleArea(Rectangle rectangle) {
        return rectangle.area();
    }

    @Override
    public double ballVolume(Ball ball) {
        return ball.volume();
    }

    @Override
    public double cubeVolume(Cube cube) {
        return cube.volume();
    }

    @Override
    public double ballArea(Ball ball) {
        return ball.area();
    }

    @Override
    public double cubeArea(Cube cube) {
        return cube.area();
    }
}
