public class Parallelogram extends GeometricFigure{
    private double a;
    private double b;
    private double h;

    public Parallelogram(double a, double b, double h) throws Exception{
        if ((a <= 0) || (b <= 0) || (h <= 0)){
            throw new Exception("There is no parallelogram with such parameters");
        }
        this.a = a;
        this.b = b;
        this.h = h;
    }

    @Override
    protected double Perimeter() {
        return 2 * (a + b);
    }

    @Override
    protected double Area() {
        return a * h;
    }

//    @Override
//    public String toString(){
//        return "The perimeter of the parallelogram with the parameters " + a + ", " + b + " and the high" + c + " is "
//                + Perimeter() + "and its area is " + Area();
//    }
}
