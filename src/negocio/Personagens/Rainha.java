package negocio.Personagens;

import negocio.Armas.Faca;
import negocio.Jogador;

public class Rainha extends Personagem{

    public Rainha(int posicaovertical, int posicaohorizontal, Jogador jogador) {
        super(posicaovertical, posicaohorizontal, jogador);
        this.vida = 150;
        this.arma = new Faca();
        this.dano = this.getArma().plusDano();
        this.nome="Rainha";
        
    }

    public Rainha() {
    }

    @Override
    protected String getNome() {
        
        return nome;
    }

   
    
}
