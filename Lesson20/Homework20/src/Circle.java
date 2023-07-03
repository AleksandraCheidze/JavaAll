public class Circle {
//    Описать класс Circle со следующей информацией:
//    - радиус
//    - координаты центра
//    Предусмотреть пустой конструктор и конструктор с параметрами.
//    Использовать ключевое слово this.
//    Создать класс Task21 с методом main. Также описать метод public
//    static Circle getMinRadiusCircle(Cirlce[] circles). Данный метод
//    должен вернуть круг с минимальным радиусом из массива circles.
//    В методе main создать не менее десяти кругов. Массив из этих кругов
//    необходимо передать в метод getMinRadiusCircle и вывести в консоль
//    координаты центра круга с минимальным радиусом.

    double radius; // радиус

    // координаты центра
    double x0;
    double y0;


    // пустой конструктор
    Circle (){
        double radius = 10;
        double x0 = 2;
        double y0 = 6;


    }

    // конструктор с параметрами
    // Использовать ключевое слово this.
    Circle (double radius, double x0, double y0) {
        this.radius = radius;
        this.x0 = x0;
        this.y0 = y0;

    }
}
