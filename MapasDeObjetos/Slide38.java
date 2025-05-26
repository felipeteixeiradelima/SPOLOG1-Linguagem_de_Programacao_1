package MapasDeObjetos;

import java.util.HashMap;
import java.util.Map;

public class Slide38 {
    public static void main(String[] args) {
        Map<String, String> proprietarios = new HashMap<>();

        proprietarios.put("ABC1111", "João");
        proprietarios.put("ABC4444", "Maria");
        proprietarios.put("ABC3333", "Pedro");
        proprietarios.put("ABC2222", "Carlos");
        System.out.println(proprietarios);

        System.out.println("Número de proprietários: " + proprietarios.size());

        if (!proprietarios.isEmpty())
            System.out.println("O mapa não está vazio.");
        
        System.out.println("Placas: " + proprietarios.keySet());

        System.out.println("Proprietários: " + proprietarios.values());
    }
}
