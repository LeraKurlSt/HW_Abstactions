import java.util.ArrayList;

public class ComplexFigure {
    private ArrayList<GeometricFigure> figureArrayList = new ArrayList<>(){};

    ComplexFigure(GeometricFigure geometricFigure){
        try {
            figureArrayList.add(geometricFigure);{}
        } catch (Exception exception){
            System.out.println(exception.getMessage());
        }
    }

    public void Add(GeometricFigure geometricFigure){
        try {
            figureArrayList.add(geometricFigure);
        }catch (Exception exception){
            System.out.println(exception.getMessage());
        }
    }

    public double CombinedArea(){
        double ca = 0;
        for (GeometricFigure gf : figureArrayList){
            ca += gf.Area();
        }
        return ca;
    }

    public double CombinedPerimeter(){
        double cp = 0;
        for (GeometricFigure gf : figureArrayList){
            cp += gf.Perimeter();
        }
        return cp;
    }
}
