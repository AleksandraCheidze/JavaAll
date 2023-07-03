public class Main {
    public static void main(String[] args) {
        //    Доделать классы-фигуры (плоские).
//    У каждой фигуры можно взять площадь и периметр.
//    Создать класс Paper (бумага) - есть свойство высота и ширина.
//    На бумаге можно размещать фигуры.
//    Добавить новую фигуру можно только в том случае, если для нее есть место:
//    Суммарная площадь всех фигур меньше площади бумаги.
//    Делается по аналогии с example05
//    В Main показать работоспособность.

        Circle c1 = new Circle(5,2,10);
        System.out.println("Circle ares is: " + c1.area());
        System.out.println("Circle perimeter is: " + c1.perimeter());

        Quadrate q1 = new Quadrate(1,3,4);
        System.out.println("Quadrate ares is: " +q1.area());
        System.out.println("Quadrate perimeter is: " +q1.perimeter());

        Ellipse e1 = new Ellipse(2,5,7,13);
        System.out.println("Ellipse ares is: " +e1.area());
        System.out.println("Ellipse perimeter is: " +e1.perimeter());

        Rectangle r1 = new Rectangle(3,4,8,10);
        System.out.println("Rectangle ares is: " +r1.area());
        System.out.println("Rectangle perimeter is: " +r1.perimeter());

        Paper paper = new Paper(7,6);
        paper.add(c1);
        paper.add(q1);
        paper.add(e1);
        paper.add(r1);
        System.out.println("Paper ares is: " +paper.area());
        System.out.println("Sum of all figures: " + paper.areaSum());






    }
}