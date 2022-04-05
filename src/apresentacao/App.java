package apresentacao;

import java.util.Scanner;

import negocio.*;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner entrada = new Scanner(System.in);
        boolean Invalidado = true;
        int posicaohorizontal;
        int posicaovertical;
        Rainha rainhaJ1 = new Rainha();
        Rei reiJ1 = new Rei();
        Cavaleiro cavaleiroJ1 = new Cavaleiro();
        Peao peaoJ1 = new Peao();
        Rainha rainhaJ2 = new Rainha();
        Rei reiJ2 = new Rei();
        Cavaleiro cavaleiroJ2 = new Cavaleiro();
        Peao peaoJ2 = new Peao();
        


        System.out.println(
                "Bem vindo ao Batalha Medieval! \n No jogo você deve posicionar as peças: Rainha, Rei, Cavaleiro e 1 peão dentro do tabuleiro que na posição vertical vai de 0 a 9 e na horizontal de 0 a 4");

        /* while (Invalidado == true)
        try {
            System.out.println("Jogador 1 Digite a posição vertical da Rainha:");
            posicaovertical = entrada.nextInt();
            System.out.println("Jogador 1 Digite a posição horizontal da Rainha:");
            posicaohorizontal = entrada.nextInt();
            rainhaJ1 = new Rainha(posicaovertical, posicaohorizontal);
            Invalidado = false;
            System.out.println(rainhaJ1.toString());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        Invalidado = true;

        while (Invalidado == true)
            try {
                System.out.println("Jogador 1 Digite a posição vertical do Rei:");
                posicaovertical = entrada.nextInt();
                System.out.println("Jogador 1 Digite a posição horizontal do Rei:");
                posicaohorizontal = entrada.nextInt();
                reiJ1 = new Rei(posicaovertical, posicaohorizontal);
                Invalidado = false;
                System.out.println(reiJ1.toString());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        Invalidado = true;

        while (Invalidado == true)
            try {
                System.out.println("Jogador 1 Digite a posição vertical do Cavaleiro:");
                posicaovertical = entrada.nextInt();
                System.out.println("Jogador 1 Digite a posição horizontal do Cavaleiro:");
                posicaohorizontal = entrada.nextInt();
                cavaleiroJ1 = new Cavaleiro(posicaovertical, posicaohorizontal);
                Invalidado = false;
                System.out.println(cavaleiroJ1.toString());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        Invalidado = true;

        while (Invalidado == true)
            try {
                System.out.println("Jogador 1 Digite a posição vertical do Peao:");
                posicaovertical = entrada.nextInt();
                System.out.println("Jogador 1 Digite a posição horizontal do Peao:");
                posicaohorizontal = entrada.nextInt();
                peaoJ1 = new Peao(posicaovertical, posicaohorizontal);
                Invalidado = false;
                System.out.println(peaoJ1.toString());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        Invalidado = true;
            //JOGADOR 2 ===========================================================================================
            System.out.println("É a vez do Jogador 2");
                    
            while (Invalidado == true)
                try {
                    System.out.println("Jogador 2 Digite a posição vertical da Rainha:");
                    posicaovertical = entrada.nextInt();
                    System.out.println("Jogador 2 Digite a posição horizontal da Rainha:");
                    posicaohorizontal = entrada.nextInt();
                    rainhaJ2 = new Rainha(posicaovertical, posicaohorizontal);
                    Invalidado = false;
                    System.out.println(rainhaJ2.toString());
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            Invalidado = true;

            while (Invalidado == true)
                try {
                    System.out.println("Jogador 2 Digite a posição vertical do Rei:");
                    posicaovertical = entrada.nextInt();
                    System.out.println("Jogador 2 Digite a posição horizontal do Rei:");
                    posicaohorizontal = entrada.nextInt();
                    reiJ2 = new Rei(posicaovertical, posicaohorizontal);
                    Invalidado = false;
                    System.out.println(reiJ2.toString());
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            Invalidado = true;

            while (Invalidado == true)
                try {
                    System.out.println("Jogador 2 Digite a posição vertical do Cavaleiro:");
                    posicaovertical = entrada.nextInt();
                    System.out.println("Jogador 2 Digite a posição horizontal do Cavaleiro:");
                    posicaohorizontal = entrada.nextInt();
                    cavaleiroJ2 = new Cavaleiro(posicaovertical, posicaohorizontal);
                    Invalidado = false;
                    System.out.println(cavaleiroJ2.toString());
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            Invalidado = true;

            while (Invalidado == true)
                try {
                    System.out.println("Jogador 2 Digite a posição vertical do Peao:");
                    posicaovertical = entrada.nextInt();
                    System.out.println("Jogador 2 Digite a posição horizontal do Peao:");
                    posicaohorizontal = entrada.nextInt();
                    peaoJ2 = new Peao(posicaovertical, posicaohorizontal);
                    Invalidado = false;
                    System.out.println(peaoJ2.toString());
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            Invalidado = true; */


            //posições marcadas
            rainhaJ1 = new Rainha(0,2);
            reiJ1 = new Rei(0,3);
            cavaleiroJ1 = new Cavaleiro(0,1);
            peaoJ1 = new Peao(0,4);
            rainhaJ2 = new Rainha(1,1);
            reiJ2 = new Rei(3,3);
            cavaleiroJ2 = new Cavaleiro(9,0);
            peaoJ2 = new Peao(9,3);

            reiJ1.atacar(reiJ2);
            reiJ1.andar(Direcao.CIMA);
            reiJ1.atacar(reiJ2);
            
            System.out.println(reiJ1.toString());
            System.out.println(reiJ2.toString());
            cavaleiroJ1.getArma();

















    }
}
