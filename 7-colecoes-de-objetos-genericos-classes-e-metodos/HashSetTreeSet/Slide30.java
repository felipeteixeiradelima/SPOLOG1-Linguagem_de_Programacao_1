package HashSetTreeSet;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Slide30 {
    public static void main(String[] args) {
        Set<String> clientes = new TreeSet<>(Arrays.asList("João", "Pedro", "Paulo", "Maria", "Carlos"));

        Set<String> fornecedores = new TreeSet<>(Arrays.asList("Ana", "Paulo", "Antonio", "Isabel", "Maria"));

        System.out.println("Clientes: " + clientes);
        System.out.println("Fornecedores: " + fornecedores);

        clientes.removeAll(fornecedores);
        System.out.println("Clientes - Fornecedores: " + clientes);
    }
}
