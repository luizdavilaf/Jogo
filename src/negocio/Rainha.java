package negocio;

public class Rainha extends Personagem{

    public Rainha(int posicaovertical, int posicaohorizontal) {
        super(posicaovertical, posicaohorizontal);
        this.vida = 150;
        this.arma = new Faca();
        this.dano = this.getArma().plusDano();
        //TODO Auto-generated constructor stub
    }

    public Rainha() {
    }

   
    
}
