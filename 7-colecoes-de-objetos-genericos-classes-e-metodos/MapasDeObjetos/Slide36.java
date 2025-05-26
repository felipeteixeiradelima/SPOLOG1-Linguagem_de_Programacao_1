package MapasDeObjetos;

import java.util.HashMap;
import java.util.Map;

public class Slide36 {
    public static void main(String[] args) {
        Map<String, String> proprietarios = new HashMap<>();

        proprietarios.put("ABC1111", "João");
        proprietarios.put("ABC4444", "Maria");
        proprietarios.put("ABC3333", "Pedro");
        proprietarios.put("ABC2222", "Carlos");
        System.out.println(proprietarios);

        if (proprietarios.containsKey("ABC3333"))
            System.out.println("O mapa contém a placa 'ABC3333'.");

        if (proprietarios.containsValue("Maria"))
            System.out.println("O mapa contém o proprietário 'Maria'.");

        System.out.println("Proprietário do veículo placa ABC3333: " + proprietarios.get("ABC3333"));

        proprietarios.remove("ABC2222");
        System.out.println(proprietarios);
    }
}
