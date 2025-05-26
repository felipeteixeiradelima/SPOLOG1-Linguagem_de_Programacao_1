package ArrayListLinkedList;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class Pilha {
    public static void main(String[] args) {
        Deque<String> pilha = new LinkedList<>(Arrays.asList("João", "Maria", "Pedro", "Carlos"));

        pilha.addLast("Julia");
        System.out.println(pilha);

        System.out.println("Elemento que está no topo da pilha: " + pilha.peekLast());

        pilha.pollLast();
        System.out.println(pilha);
    }
}
