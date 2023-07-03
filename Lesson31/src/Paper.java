public class Paper {
  private Figure [] figures;
  private int count;
  private double height;
  private double weight;

  public Paper(int height,int weight){
    this.figures = new Figure[6];
    this.count = 0;
    this.height = height;
    this.weight = weight;
  }
  public double area (){
    return (height * weight);
  }
  public void add (Figure figure){
    if (areaSum() + figure.area() <= area()){
      figures[count] = figure;
      count++;
    } else {
      System.out.println("Больше нет места");
    }
  }

  public double areaSum() {
    double result = 0;
    for (int i = 0; i < count; i++) {
      result = result + figures[i].area();
    }

    return result;
  }

}
