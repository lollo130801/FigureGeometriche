public class Cerchio implements FigureGeometriche{
    private double raggio;
    //Costruttore di default
    public Cerchio(){this.raggio=1;}
    //Costruttore con parametri
    public Cerchio(double r){ this.raggio = r; }

    public double getArea(){
        return Math.PI * Math.pow(raggio,2);
    }

    public double getPerimeter(){
        return 2*Math.PI*raggio;
    }
}
