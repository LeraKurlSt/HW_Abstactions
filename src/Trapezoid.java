public class Trapezoid extends GeometricFigure{
    private double a;
    private double b;
    private double c;
    private double d;
    private double h;

    public Trapezoid(double a, double b, double c, double d, double h) throws Exception{
        double db = Math.max(d, b) - Math.min(d, b);
        double ac = Math.max(a, c) - Math.min(a, c);
        if ((a <= 0) || (b <= 0) || (c <= 0) || (d <= 0) ||(h <= 0)
                || (d - c == 0) || (b - a == 0)
                || (ac > db)
                || (db > (d + c))){
            throw new Exception("There is no trapezoid with such parameters");
        }
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.h = h;
    }

    @Override
    protected double Perimeter() {
        return a + b + c + d;
    }

    @Override
    protected double Area() {
        return (a + b) / 2 * h;
    }

//    @Override
//    public String toString(){
//        return "The perimeter of the trapezoid with the parameters " + a + ", " + b + ", " + c +
//                ", " + b + " and the high" + h + " is " + Perimeter() + "and its area is " + Area();
//    }
}
