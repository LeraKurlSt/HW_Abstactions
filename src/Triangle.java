public class Triangle extends GeometricFigure{
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) throws Exception{
        if ((a >= (b + c)) || (b >= (a + c)) || (c >= (a + b))){
            throw new Exception("There is no triangle with such parameters");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    protected double Perimeter(){
        return (a + b + c);
    }

    @Override
    protected double Area(){
        double p = Perimeter() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

//    @Override
//    public String toString(){
//        return "The perimeter of the triangle with the parameters " + a + ", " + b + " and " + c + " is "
//                + Perimeter() + "and its area is " + Area();
//    }
}
