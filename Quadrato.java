public class Quadrato implements FigureGeometriche {
    private double lato = 0;
    // Costruttore
    public Quadrato(double l) {
        if(l<0)
            throw new IllegalArgumentException(); 
        this.lato=l;
    }

    //metodo per cercare l'area
    public double getArea(){
        return Math.pow(lato,2);
    }

    //metodo per cercare il perimetro
    public double getPerimeter(){
        return 4*lato;
    }
}
