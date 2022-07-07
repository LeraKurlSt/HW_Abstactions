public class TestCompFig {
    public static void main(String[] args) {

        GeometricFigure triangle = IndependentClass.Figures("Triangle", 5, 4, 3);
        GeometricFigure parallelogram = IndependentClass.Figures("Parallelogram", 4, 6, 2);
        GeometricFigure trapezoid = IndependentClass.Figures("Trapezoid", 5, 6, 5, 12, 4);

        ComplexFigure complexFigure = new ComplexFigure(triangle);
        complexFigure.Add(parallelogram);
        complexFigure.Add(trapezoid);

        System.out.println("Combined perimeter of all figures is " + complexFigure.CombinedPerimeter());
        System.out.println("Combined area of all figures is " + complexFigure.CombinedArea());
    }
}
