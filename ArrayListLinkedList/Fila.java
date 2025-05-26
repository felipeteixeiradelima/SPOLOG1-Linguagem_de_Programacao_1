package ArrayListLinkedList;

import java.util.Deque;
import java.util.LinkedList;

public class Fila {
    public static void main(String[] args) {
        Deque<String> fila = new LinkedList<>();

        fila.add("João");
        fila.add("Maria");
        fila.add("Pedro");
        fila.add("Carlos");

        fila.addLast("Julia");
        System.out.println(fila);

        System.out.println("1º elemento da fila: " + fila.peekFirst());

        fila.pollFirst();
        System.out.println(fila);
    }
}
