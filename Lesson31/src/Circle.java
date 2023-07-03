public class Circle extends Ellipse {

    public Circle (int x, int y, int radius ){
        super(x, y, radius, radius );


    }
     public Circle (int radius){
        super(1,1,radius,radius);

     }

     public Circle (){
        super(1,1,1,1);

     }


  public double area() {
    return (Math.PI * (smallRadius * smallRadius));
  }


  public double perimeter() {
    return (2 * Math.PI * smallRadius);
  }

  public int getRadius(){
      return smallRadius;
      }




}
