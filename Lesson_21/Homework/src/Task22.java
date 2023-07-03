import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Task22 {
    // Создать массив из 10 000 людей.
    // У каждого человека есть имя и возраст (случайное число в адекватных диапазонах).
    // Имена можно генерировать в формате: User1, User2, User3, User4
    //
    // Вывести возраст, который встречается чаще остальных.
    //Пример:
    //
    //Марсель 29
    //Виктория 18
    //Вадим 27
    //Иван 27
    //Маша 18
    //Андреас 27
    //
    //Программа должна вывести - 27
    //
    //Дополнительное требование - программа не должна содержать вложенных циклов вида:
    //
    //for (...) {
    //    for (...) {
    //    }
    //}
    public static void main(String[] args) {
        Human[] humans = new Human[10000];
        Random random = new Random();
        for (int i = 0; i < humans.length; i++) {
            int age = random.nextInt(100) + 1; // Генерируем случайный возраст в диапазоне от 1 до 100
            String name = "User" + (i + 1);
            humans[i] = new Human(name, age);
        }

        int mostFrequentAge = findMostFrequentElement(humans);
        System.out.println("Самый часто встречающийся возраст: " + mostFrequentAge);
    }

    public static int findMostFrequentElement(Human[] humans) {
        int[] countArray = new int[101];
        for (int i = 0; i < humans.length; i++) {
            int age = humans[i].getAge();
            countArray[age]++;
        }
        int maxCount = 0;
        int mostFrequentAge = 0;

        for (int age = 1; age < countArray.length; age++) {
            int count = countArray[age];
            if (count > maxCount) {
                maxCount = count;
                mostFrequentAge = age;
            }
        }

        return mostFrequentAge;
    }





    }