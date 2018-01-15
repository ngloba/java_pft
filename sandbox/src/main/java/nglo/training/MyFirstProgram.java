package nglo.training;

public class MyFirstProgram {

public static void main (String[] args) {
    hello("Thomaas");

    Square s = new Square(0.5);
    /*s.l = 0.5;*/
    System.out.println("square of "+ s.l +"= " +s.area());

    Rectangle r = new Rectangle(15,25);
   /* r.a = 15;
    r.b=25;*/

    System.out.println("площадь прямоугольника со сторонами " +r.a+ " и " +r.b+ "= " +r.area());

    Point p1 = new Point(5,6);
    Point p2 = new Point(12,13);

    System.out.println(Point.distance(p1,p2));


}
   public static void hello (String somebody) {
        System.out.println("Hello, " + somebody);
    }













}