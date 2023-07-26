public class Task34 {
  //Написать абстрактный класс MinMaxGetter.
  //- Класс принимает на вход массив и печатает его минимум и максимум.
  //- Методы поиска минимума и максимума сделать абстрактными.
  //- Сделать две реализации:
  //- SimpleMinMaxGetter - находит максимум и минимум простым перебором
  //- SelectionSortMinMaxGetter - сортирует массив методом выбора и выводит максимум и минимум

  public static void main(String[] args) {
    int[] array = {88, 6, 1, 9, 10};
    SimpleMinMaxGetter s1 = new SimpleMinMaxGetter(array);
    s1.printMin();
    s1.printMax();

    SelectionSortMinMaxGetter s2 = new SelectionSortMinMaxGetter(array);
    s2.printMax();
    s2.printMin();

  }
}