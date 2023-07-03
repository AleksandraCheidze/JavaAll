public class MyLinkedList {
    // На базе класса MyLinkedList реализовать метод:
    // public int get(int index);
    private Node first; // null
    private Node last; // указатель на последний элемент
    private int count;

    public MyLinkedList() {
        this.count = 0;
    }


    public void add(int element) {
        Node newNode = new Node(element); // создали новый узел

        if (count == 0) { // если элементов нет
            first = newNode; // первый узел и есть новый
        } else {
            last.next = newNode; // если элементы были, то следующий после последнего - новый узел
        }

        last = newNode; // новый узел теперь последний
        count++;
    }

    public void addFirst(int element) {
        Node newNode = new Node(element); // создали новый узел

        if (first != null) { // если в списке уже есть элементы
            newNode.next = first; // делаем следующий после нового - первый
        } else {
            last = newNode; // если список пустой, то новый элемент - также последний
        }

        first = newNode; // новый узел стал первым в списке
        count++;
    }

    public int getCount() {
        return count;
    }

    // получение элемента по индексу
    public int get(int index) {
        if (index < 0 || index >= count) {
            System.out.println("Invalid index " + index);
        }

        Node current = first;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        return current.value;
    }
}


