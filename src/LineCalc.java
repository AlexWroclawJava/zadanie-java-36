public class LineCalc {

    public double lineLength(Line2D line2D){
        return  Math.sqrt( Math.pow(line2D.ending.x - line2D.beginning.x, 2)  +
                Math.pow(line2D.ending.y - line2D.beginning.y, 2));
    }
}
