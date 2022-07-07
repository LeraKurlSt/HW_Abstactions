public class IndependentClass {

    public static GeometricFigure Figures(String figureType, double... a){
//        GeometricFigure geometricFigure = null;
        try {
//            geometricFigure =
                    switch(figureType){
                case "Triangle":
                    if (a.length == 3){
                        return new Triangle(a[0], a[1], a[2]);
                    }else {
                        throw new Exception("There is some mistake, try again");
                    }
                case "Parallelogram":
                    if (a.length == 3){
                        return   new Parallelogram(a[0], a[1], a[2]);
                    }else {
                        throw new Exception("There is some mistake, try again");
                    }
                case "Trapezoid":
                    if (a.length == 5){
                        return new Trapezoid(a[0], a[1], a[2], a[3], a[4]);
                    }else {
                        throw new Exception("There is some mistake, try again");
                    }
            }
        }catch (Exception exception){
            System.out.println(exception.getMessage());
        }
//        return geometricFigure;
        return null;
    }
}
