package ec.edu.puce.clasesabstractas;

class Triangulo extends FiguraGeometrica {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    @Override
    public String toString() {
        return "Triángulo con base: " + base + ", altura: " + altura + ", área: " + calcularArea();
    }
}

