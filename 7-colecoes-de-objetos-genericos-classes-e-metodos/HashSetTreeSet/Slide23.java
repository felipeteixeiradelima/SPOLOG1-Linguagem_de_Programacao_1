package HashSetTreeSet;

import java.util.Arrays;
import java.util.TreeSet;
import java.util.Set;

public class Slide23 {
    public static void main(String[] args) {
        Set<String> alunos = new TreeSet<>();

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
    }
}
