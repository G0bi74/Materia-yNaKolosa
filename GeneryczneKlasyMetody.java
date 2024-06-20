import java.util.ArrayList;
import java.util.List;

/**
 * Generyczna klasa para przechowująca dwa elementy różnych typów.
 * @param <T> Typ pierwszego elementu
 * @param <U> Typ drugiego elementu
 */
class Pair<T, U> {
    private T first;
    private U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public void setSecond(U second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return "(" + first + ", " + second + ")";
    }
}

/**
 * Klasa generyczna do obsługi listy elementów.
 * @param <E> Typ elementów listy
 */
class ListHandler<E> {
    private List<E> elements;

    public ListHandler() {
        this.elements = new ArrayList<>();
    }

    public void addElement(E element) {
        elements.add(element);
    }

    public E getElement(int index) {
        if (index >= 0 && index < elements.size()) {
            return elements.get(index);
        } else {
            return null;
        }
    }

    public void printElements() {
        for (E element : elements) {
            System.out.println(element);
        }
    }
}

public class GenericsExample {

    public static void main(String[] args) {
        // Przykład użycia generycznej klasy Pair
        Pair<Integer, String> pair1 = new Pair<>(1, "Jeden");
        Pair<Double, Integer> pair2 = new Pair<>(2.5, 2);

        System.out.println("Para 1: " + pair1);
        System.out.println("Para 2: " + pair2);

        // Przykład użycia generycznej klasy ListHandler
        ListHandler<String> stringListHandler = new ListHandler<>();
        stringListHandler.addElement("Pierwszy");
        stringListHandler.addElement("Drugi");
        stringListHandler.addElement("Trzeci");

        System.out.println("Elementy listy:");
        stringListHandler.printElements();

        // Możliwość obsługi różnych typów za pomocą jednej generycznej klasy
        ListHandler<Integer> integerListHandler = new ListHandler<>();
        integerListHandler.addElement(1);
        integerListHandler.addElement(2);
        integerListHandler.addElement(3);

        System.out.println("Elementy listy liczb całkowitych:");
        integerListHandler.printElements();
    }
}
