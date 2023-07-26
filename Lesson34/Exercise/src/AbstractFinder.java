import java.util.Scanner;

public abstract class AbstractFinder {
        protected int[] elements;

        public AbstractFinder(int[] elements) {

          this.elements = elements;
        }

        public abstract boolean find(int element);

        public void findNumberAndPrint() {
            System.out.println("Введите число ");
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();

            boolean result = find(number);

            System.out.println("Число не найдено? - " + result);
        }
    }


