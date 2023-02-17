package MyCulc.Model;

public class SumCalc extends CalcModel {

    public double result() {
        return x + y;
    }
    public void setX(double value) {
        super.x = value;
    }
    public void setY(double value) {
        super.y = value;
    }
}
