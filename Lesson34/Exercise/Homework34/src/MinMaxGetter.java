public abstract class MinMaxGetter {

  protected int[] elements;

  public MinMaxGetter(int[] elements) {
    this.elements = elements;
  }

  public abstract int findMin();

  public abstract int findMax();

  public void printMin() {
    int min = findMin();
    System.out.println("Minimum: " + min);
  }

  public void printMax() {
    int max = findMax();
    System.out.println("Maximum: " + max);
  }
}

