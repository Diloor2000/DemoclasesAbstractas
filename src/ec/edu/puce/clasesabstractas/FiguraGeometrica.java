package ec.edu.puce.clasesabstractas;

public abstract class FiguraGeometrica {
    public abstract double calcularArea();

    public boolean mayorQue(FiguraGeometrica otra) {
        return this.calcularArea() > otra.calcularArea();
    }

    @Override
    public String toString() {
        return "FiguraGeometrica con área: " + calcularArea();
    }
}
