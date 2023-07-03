public class Ellipse extends Figure {
    protected int largeRadius;
    protected int smallRadius;

    public Ellipse (int x, int y,int largeRadius, int smallRadius){
        super(x, y);
        this.largeRadius = largeRadius;
        this.smallRadius = smallRadius;
    }

    public int getLargeRadius() {
        return largeRadius;
    }


    public double area() {
        return (Math.PI * smallRadius * largeRadius);
    }
    public double perimeter (){
        return ((4 *( Math.PI * smallRadius * largeRadius) + ((largeRadius - smallRadius)*(largeRadius - smallRadius)))/(smallRadius + largeRadius));
    }


    public int getSmallRadius() {
        return smallRadius;
    }
}

