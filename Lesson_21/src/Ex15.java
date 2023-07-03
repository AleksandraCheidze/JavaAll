public class Ex15 {
    // Пусть есть набор точек x,y
    // Необходимо вывести точку с минимальной разницей между x,y

    // создать класс Point с двумя координаты x,y
    // создать массив Point-ов (минимум 5 штук)
    // написать процедуру, которая вернет Point с минимальной разницей между x,y
    public static void main (String[] args) {
        Point a1 = new Point (7,5);
        Point a2 = new Point(10,9);
        Point a3 = new Point(17,11);
        Point a4 = new Point(10,9);
        Point a5 = new Point(14,12);

        Point [] points = {a1, a2, a3, a4, a5};

        Point minPoint = getMinPointDifference(points);
        System.out.println( minPoint.x + ", " + minPoint.y );




    }
    public static Point getMinPointDifference(Point[] points){
        Point minPoint = points[0];


        for (int i = 1; i < points.length; i++) {
            int difference = points[i].x - points[i].y;
            int minDifference = minPoint.x - minPoint.y;
            if (difference < minDifference) {
                minPoint = points[i];
            }
        }

        return minPoint;
    }



    }

