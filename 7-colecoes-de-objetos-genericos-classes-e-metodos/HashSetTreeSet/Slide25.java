package HashSetTreeSet;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class Slide25 {
    public static void main(String[] args) {
        SortedSet<String> alunos = new TreeSet<>(Arrays.asList("João", "Maria", "Pedro", "Carlos", "Raquel"));

        System.out.println(alunos);

        System.out.println("1º aluno do conjunto: " + alunos.first());

        System.out.println("Último aluno do conjunto: " + alunos.last());

        System.out.println("Alunos antecessores de Maria: " + alunos.headSet("Maria"));

        System.out.println("Maria e seus alunos sucessores: " + alunos.tailSet("Maria"));

        System.out.println("Subconjunto: " + alunos.subSet("João", "Pedro"));
    }
}
