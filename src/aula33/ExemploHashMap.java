package aula33;

import java.util.HashMap;

public class ExemploHashMap {
    public static void main(String[] args) {
        HashMap<String, String> capitais = new HashMap<>();
        capitais.put("RS", "Porto Alegre");
        capitais.put("PR", "Curitiba");
        capitais.put("SC", "Florianópolis");
        //iterar pelas chaves
        System.out.println("Estados");
        for(String estado:capitais.keySet())
            System.out.print(estado+" ");
        //iterar pelos valores
        System.out.println("\nCidades");
        for(String cidade:capitais.values())
            System.out.println(cidade+" ");

        System.out.println("Lista completa");
        System.out.println(capitais);
        capitais.put("RS", "Rio Grande");
        System.out.println(capitais);
        System.out.println();
    }
}
