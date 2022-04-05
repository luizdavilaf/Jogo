package negocio;

public class Cavaleiro extends Personagem{

    public Cavaleiro(int posicaovertical, int posicaohorizontal) {
        super(posicaovertical, posicaohorizontal);
        this.vida=80;
        this.arma = new Espada();
        this.dano = this.getArma().plusDano();
        //TODO Auto-generated constructor stub
    }

    public Cavaleiro() {
    }

    
    
}
