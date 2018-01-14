package nglo.training;

public class MyFirstProgram {

public static void main (String[] args) {
    hello("Thomaas");

    double len = 0.5;
    System.out.println("square of "+ len +"= " +area(len));

    double a = 15;
    double b=25;

    System.out.println("площадь прямоугольника со сторонами " +a+ " и " +b+ "= " +area(a,b));
}
   public static void hello (String somebody) {
        System.out.println("Hello, " + somebody);
    }

    public static double area (double l) {
        return l*l;
    }

    public static double area (double a, double b) {
    return a*b;
    }

}