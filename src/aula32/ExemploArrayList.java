package aula32;

import java.util.ArrayList;

public class ExemploArrayList {
    public static void main(String[] args) {
        //arraylist<tipo ->Integer, float, double, pessoa> nome = new arraylist<>(capacidade -> opcional)
        ArrayList<String> l1 = new ArrayList<>();
        l1.add("A");
        l1.add("C");
        l1.add("D");
        l1.add("E");
        System.out.println(l1);
        l1.add(1,"B");
        System.out.println(l1);
        System.out.println("obter o elemento da posição 2: "+l1.get(2));
        System.out.println("O elemento 'E' está na posição: "+l1.indexOf("E"));
        l1.add("C");
        //não tem
        System.out.println("O último 'C' da lista está na posição: "+l1.lastIndexOf("C"));
        //não tem
        System.out.println("O elemento A existe na lista: "+l1.contains("A"));
        //Descobrindo o tamanho da lista
        System.out.println("A lista tem: "+l1.size()+ " elementos");
        //removendo elemento da posição 2
        System.out.println("Apagando o elemento da posição 2: "+l1.remove(2));
        //removendo elemento pelo elemento
        l1.remove("G");
        //limpando a lista
        l1.clear();
        System.out.println(l1);

    }

}
