package negocio;

public class Rei extends Personagem {

    public Rei(int posicaovertical, int posicaohorizontal) {
        super(posicaovertical, posicaohorizontal);
        this.vida = 100;
        this.arma = new ArcoEFlecha();
        this.dano = this.getArma().plusDano();
        //TODO Auto-generated constructor stub
    }

    public Rei() {
        
    }

    

   
    
}
