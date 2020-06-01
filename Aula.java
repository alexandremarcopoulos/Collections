public class Aula {
//  Definição dos tipos e atributos.
    private String titulo;
    private int tempo;
//  Definição do Construtor. 
    public Aula(String titulo, int tempo) {
        this.titulo = titulo;
        this.tempo = tempo;
    }
//  Getter feito para pegar o titulo.
    public String getTitulo() {
        return titulo;
    }
// Getter feito para pegar o tempo de aula
   public int getTempo() {
        return tempo;
    }}

// Importando o list e o ArrayList
import java.util.List;
import java.util.ArrayList;
 
public class TestandoListas {

    public static void main(String[] args) {
      // Definindo os itens que vão para o ArrayList.
        String aula1 = "Modelando a classe Aula";
        String aula2 = "Conhecendo mais de listas";
        String aula3 = "Trabalhando com Cursos e Sets";
      // ArrayList aulas instanciado.
        ArrayList<String> aulas = new ArrayList<>();
      // Adicionando as variaveis para o ArrayList.
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);        
      //  Apresentando tanto aulas quanto o tamanho.
        System.out.println(aulas);
        System.out.println(aulas.size());
 
        // cuidado! <= faz sentido aqui?
        for (int i = 0; i <= aulas.size(); i++) {
            System.out.println("Aula: " + aulas.get(i));
        }
    }
}

