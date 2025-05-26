package MapasDeObjetos;

import java.util.HashMap;
import java.util.Map;

public class Slide35 {
    public static void main(String[] args) {
        Map<String, String> proprietarios = new HashMap<>();

        proprietarios.put("ABC1111", "João");
        proprietarios.put("ABC4444", "Maria");
        proprietarios.put("ABC3333", "Pedro");
        proprietarios.put("ABC2222", "Carlos");
        System.out.println(proprietarios);

        proprietarios.put("ABC5555", "Maria");
        System.out.println(proprietarios);

        proprietarios.put("ABC3333", "Julia");
        System.out.println(proprietarios);
    }
}
