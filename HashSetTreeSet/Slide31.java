package HashSetTreeSet;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Slide31 {
    public static void main(String[] args) {
        Set<String> conjunto1 = new TreeSet<>(Arrays.asList("João", "Paulo", "Antonio", "Maria"));

        Set<String> conjunto2 = new TreeSet<>(Arrays.asList("Paulo", "Maria"));

        System.out.println("Conjunto 1: " + conjunto1);
        System.out.println("Conjunto 1: " + conjunto2);

        if (conjunto1.containsAll(conjunto2))
            System.out.println("O conjunto 1 contém o conjunto 2.");
    }
}
