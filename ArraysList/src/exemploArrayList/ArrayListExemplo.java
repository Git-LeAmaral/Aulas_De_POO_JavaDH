package exemploArrayList;

import java.util.ArrayList;

public class ArrayListExemplo {

    public static void main(String[] args) {

        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Leandro");
        nomes.add("Leticia");
        nomes.add("Michelle");

        System.out.println(nomes.size());//Retorna o numero de posições do array
        System.out.println(nomes.toString());
        System.out.println(nomes.indexOf("Michelle"));//Retorna a posição do objeto que estamos acessando

        nomes.remove(2);

        System.out.println(nomes.isEmpty());//Retorna um booleano do array
        System.out.println(nomes.contains("Leandro"));//Retorna um booleano true se conter o objeto caso contrario false
        System.out.println(nomes.toString());
        System.out.println(nomes.get(1));
    }
}
