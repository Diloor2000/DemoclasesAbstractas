package ec.edu.puce.clasesabstractas;

class Circulo extends FiguraGeometrica {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public String toString() {
        return "Círculo con radio: " + radio + ", área: " + calcularArea();
    }
}

