public class SelectionSortMinMaxGetter extends MinMaxGetter {

  public SelectionSortMinMaxGetter(int[] array) {
    super(array);
  }

  @Override
  public int findMin() {
    selectionSort();
    return elements[0];
  }

  @Override
  public int findMax() {
    selectionSort();
    return elements[elements.length - 1];
  }

  private void selectionSort() {
    for (int i = 0; i < elements.length - 1; i++) {
      int minIndex = i;
      for (int j = i + 1; j < elements.length; j++) {
        if (elements[j] < elements[minIndex]) {
          minIndex = j;
        }
      }
      int temp = elements[minIndex];
      elements[minIndex] = elements[i];
      elements[i] = temp;
    }
  }
}