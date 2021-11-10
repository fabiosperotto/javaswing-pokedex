package br.com.ifsul.glossariopokemon;

import br.com.ifsul.entidades.Pokemon;
import br.com.ifsul.gui.TelaGlossario;
import java.util.ArrayList;

/**
 *
 * @author fabiosperotto
 */
public class Sistema {
    
    public static void main(String[] args) {
        
        //a recuperacao das informacoes de pokemon podem ser dentro da classe Pokemon ou dentro da classe TelaGlossario
        //lembre-se das aulas de persistencia, poderiamos consultar sobre os pokemons diretamente na TelaGlossario
        ArrayList<Pokemon> lista = new ArrayList<Pokemon>();                
        
        Pokemon poke1 = new Pokemon(1, "Pikachu", "pikachu.png");
        Pokemon poke2 = new Pokemon(2, "Bulbassauro", "bulbassauro.png");
        Pokemon poke3 = new Pokemon(3, "Charmander", "charmander.png");
        
        lista.add(poke1);
        lista.add(poke2);
        lista.add(poke3);
        
        TelaGlossario tela = new TelaGlossario(lista);
        tela.setLocationRelativeTo(null);
        tela.setVisible(true);
        
    }
    
}
