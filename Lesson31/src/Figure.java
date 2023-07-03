public class Figure {
    private final static String COLORS = "Red Green Yellow Black Blue";

    private final static String DEFAULT_COLOR = "Black";

    private int x;
    private int y;

    private String color;

    public Figure (int x, int y){
        this.x = x;
        this.y = y;
        this.color = DEFAULT_COLOR;

    }
     public void setColor (String color){
        if (COLORS.contains(color)){
            this.color = "Black";
        }else {
            this.color = DEFAULT_COLOR;
        }
     }
      public double area (){
        return 0;
      }
      public double perimeter (){
        return 0;
      }


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getColor() {
        return color;
    }
}
