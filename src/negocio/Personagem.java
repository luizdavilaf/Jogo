package negocio;

import java.util.Scanner;

public abstract class Personagem {
    protected Arma arma;
    protected ArcoEFlecha arcoEFlecha = new ArcoEFlecha();
    protected int vida; // cada classe de personagem tem sua vida
    protected int posicaovertical; // eixo y de 0 a 9
    protected int posicaohorizontal; // eixo x de 0 a 4
    protected int dano; // de acordo com a arma
    Scanner entrada = new Scanner(System.in);

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }
    public Personagem(){

    };

    public Personagem(int posicaovertical, int posicaohorizontal) {

        if (posicaovertical < 0 | posicaovertical > 9)

        {
            throw new IllegalArgumentException("Posição Vertical inválida, reiniciando...");
        } else if (posicaohorizontal < 0 | posicaohorizontal > 4) {
            throw new IllegalArgumentException("Posição Horizontal inválida, reiniciando...");

        }
        this.arma = new SemArma();
        this.posicaohorizontal = posicaohorizontal;
        this.posicaovertical = posicaovertical;
        this.dano = this.getArma().plusDano();
    }

    @Override
    public String toString() {
        return "Personagem [dano=" + dano + ", posicaohorizontal=" + posicaohorizontal + ", posicaovertical="
                + posicaovertical + ", vida=" + vida + "]";
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public void atacar(Personagem oponente) {
        int deltaX = Math.abs(this.posicaohorizontal - oponente.posicaohorizontal);
        int deltaY = Math.abs(this.posicaovertical - oponente.posicaovertical);
        System.out.println("deltax:"+deltaX);
        System.out.println("deltay:"+deltaY);
        System.out.println("arma:" + this.getArma().toString());
        System.out.println("arma:" + arcoEFlecha.toString());
        if (this.getArma().equals(arcoEFlecha)){
            if (deltaX==0 && deltaY==2){
            oponente.setVida(oponente.getVida() - this.dano);
            System.out.println("acertou com arco e flecha");
            }
            if(deltaX==2 && deltaY==0){
            oponente.setVida(oponente.getVida() - this.dano);
            System.out.println("acertou com arco e flecha");
            } 
        }
        else if (deltaX==0 && deltaY==1){
            oponente.setVida(oponente.getVida() - this.dano);
            System.out.println("acertou com "+ this.getArma().toString());
        }else if(deltaX==1 && deltaY==0)
        {
            oponente.setVida(oponente.getVida() - this.dano);
            System.out.println("acertou com " + this.getArma().toString());
        }
        else{
            System.out.println("Você errou o alvo!");            
        }
    }

    public boolean andar(Direcao direcao) {
        if ((direcao == Direcao.DIREITA) && (posicaohorizontal < 4)) {
            posicaohorizontal++;
            return true;
        } else if ((direcao == Direcao.ESQUERDA) && (posicaohorizontal > 0)) {
            posicaohorizontal--;
            return true;
        } else if ((direcao == Direcao.CIMA) && (posicaovertical < 9)) {
            posicaovertical++;
            return true;
        } else if ((direcao == Direcao.BAIXO) && (posicaovertical > 0)) {
            posicaovertical--;
            return true;
        } else {
            System.out.println("Jogador não pode se movimentar nessa direção");
            return false;
        }

    }

}
