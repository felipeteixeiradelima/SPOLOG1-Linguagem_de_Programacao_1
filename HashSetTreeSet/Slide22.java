package HashSetTreeSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Slide22 {
    public static void main(String[] args) {
        Set<String> alunos = new HashSet<>();

        alunos.add("João");
        alunos.add("Maria");
        alunos.add("Pedro");
        alunos.add("João");
        alunos.add("Carlos");
        System.out.println(alunos);

        alunos.remove("Pedro");

        if (!alunos.isEmpty())
            System.out.println("O conjunto não está vazio.");

        if (alunos.contains("Maria"))
            System.out.println("O conjunto contém a aluna Maria.");

        System.out.println("Número de alunos: " + alunos.size());

        System.out.println(alunos);

        Set<String> alunos2 = new HashSet<>(Arrays.asList("João", "Maria", "Pedro"));
    }
}
