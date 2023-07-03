public class Quadrate extends Rectangle{

    public Quadrate (int x, int y, int length ){

        super(x, y, length, length);
    }


    public double area() {
        return (length * length);
    }
    public double perimeter (){
        return (length * 4);
    }

    public int getLength (){
        return length;

    }

}
