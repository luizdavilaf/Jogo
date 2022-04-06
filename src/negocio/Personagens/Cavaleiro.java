package negocio.Personagens;

import negocio.Jogador;
import negocio.Armas.Espada;

public class Cavaleiro extends Personagem{

    public Cavaleiro(int posicaovertical, int posicaohorizontal, Jogador jogador) {
        super(posicaovertical, posicaohorizontal, jogador);
        this.vida=80;
        this.arma = new Espada();
        this.dano = this.getArma().plusDano();
        this.nome="Cavaleiro";
        
    }

    public Cavaleiro() {
    }

    @Override
    protected String getNome() {
       
        return nome;
    }

    
    
}
