import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    int [] array = {4, 5, 2, 5, 7, 98};

    AbstractFinder finder = new SimpleFinder(array);

   finder.findNumberAndPrint();
  }
}