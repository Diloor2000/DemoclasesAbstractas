package ec.edu.puce.clasesabstractas;

public class Main {
    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo(8, 6);
        Triangulo triangulo = new Triangulo(4, 8);
        Circulo circulo = new Circulo(7);

        System.out.println(rectangulo);	
        System.out.println(triangulo);
        System.out.println(circulo);
        System.out.println("-------------------------------------------");
        System.out.println("¿Rectángulo > triángulo? " + rectangulo.mayorQue(triangulo));
        System.out.println("-------------------------------------------");
        System.out.println("¿Círculo > Rectángulo? " + circulo.mayorQue(rectangulo));
    }
}