package negocio;

public enum Jogador {
    JOGADOR1, JOGADOR2;
    
    protected int pontos;

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    private Jogador() {
        this.pontos = 0;
    }

    public void somarPontos(int dano){
        this.pontos=this.pontos+dano;        
    }

    

    

}
