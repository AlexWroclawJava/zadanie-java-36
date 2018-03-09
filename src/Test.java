public class Test {

    public static void main(String[] args) {

        Line2D line2D = new Line2D(new Point2D(1,3), new Point2D(4,7));
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(3, 4);
        Ball ball = new Ball (2);
        Cube cube = new Cube(3);
        ShapeCalculator shapeCalculator = new ShapeCalculator();

        System.out.println("Pole koła wynosi:" + Math.round(shapeCalculator.circleArea(circle)));
        System.out.println("Pole prostokąta wynosi:" + shapeCalculator.rectangleArea(rectangle));
        System.out.println("Pole kuli wynosi:" + shapeCalculator.ballArea(ball));
        System.out.println("Pole sześcianu wynosi:" + shapeCalculator.cubeArea(cube));
        System.out.println("Objętość kuli wynosi:" + shapeCalculator.ballVolume(ball));
        System.out.println("Objętość sześcianu wynosi:" + shapeCalculator.cubeVolume(cube));
        System.out.println("Długość odcinka wynosi:" + shapeCalculator.lineLength(line2D));

    }
}
