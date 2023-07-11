public class Contract extends Document {
  private double sum;

  public Contract(String name, String createdDate, double sum) {
    super(name, createdDate);
    this.sum = sum;
  }

  public double getSum() {
    return sum;
  }

  public boolean isValid() {
    return sum >= 0;
  }
}
