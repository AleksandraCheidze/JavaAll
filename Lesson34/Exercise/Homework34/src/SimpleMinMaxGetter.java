public class SimpleMinMaxGetter extends MinMaxGetter {

  public SimpleMinMaxGetter(int[] elements) {
    super(elements);
  }

  @Override
  public int findMin() {
    int min = elements[0];
    for (int i = 1; i < elements.length; i++) {
      if (elements[i] < min) {
        min = elements[i];
      }
    }
    return min;
  }

  @Override
  public int findMax() {
    int max = elements[0];
    for (int i = 1; i < elements.length; i++) {
      if (elements[i] > max) {
        max = elements[i];
      }
    }
    return max;
  }
}




