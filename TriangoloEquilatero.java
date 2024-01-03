public class TriangoloEquilatero implements FigureGeometriche {
    private double base;
    private double altezza;
    /** Costruttore della classe triangolo */
    public TriangoloEquilatero(double b, double a) {
        if(b<0||a<0)
            throw new IllegalArgumentException();
        this.base = b;
        this.altezza=a;
    }

    //funzione interface per il calcolo del perimetro
    public double getArea(){
        return (this.base * this.altezza)/2;
    }
    public double getPerimeter(){
        return this.base*3;
    }
}
