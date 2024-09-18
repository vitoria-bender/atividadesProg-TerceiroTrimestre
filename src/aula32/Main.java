package aula32;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Lista <String> l1 = new Lista<>(5);
        l1.adiciona("A");
        l1.adiciona("C");
        l1.adiciona("D");
        l1.adiciona("E");
        l1.adiciona("F");
        l1.adiciona("G");
        l1.adiciona("H");
        System.out.println(l1);
        try {
            System.out.println("Elemento da posição 1  " + l1.obter(1));
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        l1.adiciona(1,"B");
        System.out.println(l1);
        System.out.println("Removendo o elemento"+l1.remove(3));
        System.out.println(l1);
        System.out.println("Posição do 'E' na lista: "+l1.posicaoDe("E"));
        System.out.println("Posição do 'd' na lista: "+l1.posicaoDe("d"));
    }
}
