public class Rectangle extends Figure{

    protected int length;
    protected int width;

    public Rectangle (int x, int y, int length, int width){
        super(x,y);
        this.length = length;
        this.width = width;
    }


    public double area() {
        return (length * width);
    }
    public double perimeter (){
        return ((length + width)*2);
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }
}
