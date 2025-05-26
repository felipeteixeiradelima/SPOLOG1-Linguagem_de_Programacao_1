package ArrayListLinkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Slide13 {
    public static void main(String[] args) {
        List<String> alunos = new ArrayList<>(Arrays.asList("João", "Maria", "Carlos", "Pedro", "Carlos", "Maria"));
        
        alunos.set(3, "Julia");
        System.out.println(alunos);

        if (alunos.contains("Julia"))
            System.out.println("Sim, a lista contém a aluna Julia");
        
        System.out.println("Posição da 1ª ocorrência de 'Maria': " + alunos.indexOf("Maria"));

        System.out.println("Posição da última ocorrência de 'Carlos': " + alunos.lastIndexOf("Carlos"));

        if (!alunos.isEmpty())
            System.out.println("A lista não está vazia");
    }
}
