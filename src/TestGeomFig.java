public class TestGeomFig {
    public static void main(String[] args) {
        try {
            Triangle triangle = new Triangle(5, 3, 4);
            System.out.println("Perimeter of the triangle is " + triangle.Perimeter() + " and its area is " + triangle.Area());

            Parallelogram parallelogram = new Parallelogram(4,6, 2);
            System.out.println("Perimeter of the parallelogram is " + parallelogram.Perimeter() + " and its area is " + parallelogram.Area());

            Trapezoid trapezoid = new Trapezoid(5, 6, 5, 12, 4);
            System.out.println("Perimeter of the trapezoid is " + trapezoid.Perimeter() + " and its area is " + trapezoid.Area());

        }catch (Exception exception){
            System.out.println(exception.getMessage());
        }
    }
}
