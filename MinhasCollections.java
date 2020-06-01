import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
 
public class MinhasCollections {
    public static void main(String[] args) {
      // Criando a list do tipo ArrayList que recebe o nome minha lista.
        List<Integer> minhaLista = new ArrayList<Integer>();
      // adicionando dados para a lista.
        minhaLista.add(1);
        minhaLista.add(2);
        minhaLista.add(2);
      // Leitura e apresentação da lista.
        for (Integer listaElementos : minhaLista) {
            System.out.println(listaElementos);
        }
      // implementação da lista tipo set.
        Set<Integer> meuSet = new HashSet<Integer>();
      // Numeros sendo implementados ao set.
        meuSet.add(1);
        meuSet.add(2);
        meuSet.add(3);
        meuSet.add(1);
      // interator para pegar a lista completa do set.
        Iterator<Integer> iMeuSet = meuSet.iterator();
      // hasNext faz a leitura até a o ultimo elemento do set.
        while(iMeuSet.hasNext()){
      // Apresentação dos elementos.
            System.out.println(iMeuSet.next());
        }
 
    }
 
}
