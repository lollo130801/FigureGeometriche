public class Quadrato implements FigureGeometriche {
    private double lato = 0;
    // Costruttore
    public Quadrato(double l) {
        if(l<0)
            throw new IllegalArgumentException(); 
        this.lato=l;
    }
//boh
    //metodo per cercare l'area
    public double getArea(){
        return Math.pow(lato,2);
    }

    //metodo per cercare il perimetro
    public double getPerimeter(){
        return 4*lato;
    }

    //metodo che stampa lato, area e perimetro del quadrato
    public void printValues(){
        System.out.println("Lato: " + lato);
        System.out.println("Area: " + this.getArea());
        System.out.println("Perimetro: " + this.getPerimeter());
    }
    //banana002
}
