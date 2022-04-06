package negocio.Personagens;

import negocio.Armas.ArcoEFlecha;
import negocio.Jogador;

public class Rei extends Personagem {

    public Rei(int posicaovertical, int posicaohorizontal, Jogador jogador) {
        super(posicaovertical, posicaohorizontal, jogador);
        this.vida = 100;
        this.arma = new ArcoEFlecha();
        this.dano = this.getArma().plusDano();
        this.nome="Rei";
       
    }

    public Rei() {
        
    }

    @Override
    protected String getNome() {
        
        return nome;
    }

    

   
    
}
