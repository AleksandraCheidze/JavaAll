public class Task21 {
    // Создать класс Task21 с методом main. Также описать метод public
//    static Circle getMinRadiusCircle(Cirlce[] circles). Данный метод
//    должен вернуть круг с минимальным радиусом из массива circles.
//    В методе main создать не менее десяти кругов. Массив из этих кругов
//    необходимо передать в метод getMinRadiusCircle и вывести в консоль
//    координаты центра круга с минимальным радиусом.
    public static void main(String[] args) {
        Circle c1 = new Circle(10.5, 4.3, 3.5);
        Circle c2 = new Circle(7.8, 3, 1);
        Circle c3 = new Circle(16.9, 8.7, 9);
        Circle c4 = new Circle(19, 2.1, 8.2);
        Circle c5 = new Circle(20, 11.3, 14.6);
        Circle c6 = new Circle(47.1, 23.4, 34.8);
        Circle c7 = new Circle(18, 15.7, 11);
        Circle c8 = new Circle(67, 44.2, 33.4);
        Circle c9 = new Circle(11.7, 1, 3);
        Circle c10 = new Circle(47, 32.3, 39);

        Circle [] circles = {c1,c2,c3,c4,c5,c6,c7,c8,c9,c10};

        Circle minCircle = getMinRadiusCircle(circles);
        System.out.println("Координаты центра круга с минимальным радиусом: (" + minCircle.x0 + ", " + minCircle.y0 + ")");



    }
    public static Circle getMinRadiusCircle(Circle[] circles) {
        Circle minCircle = circles[0];
        for (int i = 1; i < circles.length; i++) {
            if (circles[i].radius < minCircle.radius) {
                minCircle = circles[i];
            }
        }
        return minCircle;




    }
    }