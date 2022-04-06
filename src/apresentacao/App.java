package apresentacao;

import java.util.Scanner;

import negocio.*;
import negocio.Personagens.Cavaleiro;
import negocio.Personagens.Peao;
import negocio.Personagens.Personagem;
import negocio.Personagens.Rainha;
import negocio.Personagens.Rei;

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
                "Bem vindo ao Batalha Medieval! \nNo jogo você deve posicionar as peças: Rainha, Rei, Cavaleiro e " +
                        "peão dentro do tabuleiro que na posição vertical vai de 0 a 9 e na horizontal de 0 a 4");

        
         while (Invalidado == true)
         try {
         System.out.println("Jogador 1 Digite a posição vertical da Rainha:");
         posicaovertical = entrada.nextInt();
         System.out.println("Jogador 1 Digite a posição horizontal da Rainha:");
         posicaohorizontal = entrada.nextInt();
         rainhaJ1 = new Rainha(posicaovertical, posicaohorizontal, Jogador.JOGADOR1);
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
         reiJ1 = new Rei(posicaovertical, posicaohorizontal, Jogador.JOGADOR1);
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
         cavaleiroJ1 = new Cavaleiro(posicaovertical, posicaohorizontal, Jogador.JOGADOR1);
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
         peaoJ1 = new Peao(posicaovertical, posicaohorizontal, Jogador.JOGADOR1);
         Invalidado = false;
         System.out.println(peaoJ1.toString());
         } catch (Exception e) {
         System.out.println(e.getMessage());
         }
         Invalidado = true;
         //JOGADOR 2         ===========================================================================================
         System.out.println("É a vez do Jogador 2 distribuir as peças");
         
         while (Invalidado == true)
         try {
         System.out.println("Jogador 2 Digite a posição vertical da Rainha:");
         posicaovertical = entrada.nextInt();
         System.out.println("Jogador 2 Digite a posição horizontal da Rainha:");
         posicaohorizontal = entrada.nextInt();
         rainhaJ2 = new Rainha(posicaovertical, posicaohorizontal, Jogador.JOGADOR2);
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
         reiJ2 = new Rei(posicaovertical, posicaohorizontal, Jogador.JOGADOR2);
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
         cavaleiroJ2 = new Cavaleiro(posicaovertical, posicaohorizontal, Jogador.JOGADOR2);
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
         peaoJ2 = new Peao(posicaovertical, posicaohorizontal, Jogador.JOGADOR2);
         Invalidado = false;
         System.out.println(peaoJ2.toString());
         } catch (Exception e) {
         System.out.println(e.getMessage());
         }
         Invalidado = true;
        

        // posições marcadas para teste
        /*rainhaJ1 = new Rainha(0, 2, Jogador.JOGADOR1);
        reiJ1 = new Rei(0, 3, Jogador.JOGADOR1);
        cavaleiroJ1 = new Cavaleiro(0, 1, Jogador.JOGADOR1);
        peaoJ1 = new Peao(0, 4, Jogador.JOGADOR1);
        rainhaJ2 = new Rainha(1, 2, Jogador.JOGADOR2);
        reiJ2 = new Rei(3, 3, Jogador.JOGADOR2);
        cavaleiroJ2 = new Cavaleiro(9, 0, Jogador.JOGADOR2);
        peaoJ2 = new Peao(9, 3, Jogador.JOGADOR2); */

        System.out.println(
                "\nAgora é a vez de jogar. A Cada rodada você terá 1 movimento e 1 ataque. O jogo acaba em 10 rodadas ou quando "
                        +
                        "algum jogador matar o rei do oponente.");
        System.out.println("Para andar Você deverá escolher as direções: CIMA,BAIXO,DIREITA,ESQUERDA ou NAOMOVER ");

        String direcaomovimento;
        int personagemescolhido;
        int oponenteescolhido;
        int rodadas = 2;

        while ((rodadas > 0) && (reiJ1.getVida() > 0) & (reiJ2.getVida() > 0)) {
            // MOVIMENTO J1
            System.out.println("\nRodada " + rodadas);
            System.out.println("\nÉ a vez do Jogador 1");
            System.out.println("\nJogadores para mover:");
            for (Personagem personagem : Personagem.getpersonagensJogo()) {
                if ((personagem.getJogador()) == Jogador.JOGADOR1) {
                    System.out
                            .println(Personagem.getpersonagensJogo().indexOf(personagem) + "." + personagem.toString());
                }

            }
            System.out.println("\nQual Jogador Você deseja mover?");
            personagemescolhido = entrada.nextInt();
            System.out.println("\nQual direção deseja mover: CIMA,BAIXO,DIREITA,ESQUERDA,NAOMOVER ?");
            direcaomovimento = entrada.next().toUpperCase();
            Personagem.getpersonagensJogo().get(personagemescolhido).andar(Direcao.valueOf(direcaomovimento));

            // ataque J1
            for (Personagem personagem : Personagem.getpersonagensJogo()) {
                if ((personagem.getJogador()) == Jogador.JOGADOR1) {
                    System.out
                            .println(Personagem.getpersonagensJogo().indexOf(personagem) + "." + personagem.toString());
                }
            }
            System.out.println("\nCom qual personagem Você deseja atacar?");
            personagemescolhido = entrada.nextInt();

            System.out.println("\nOponentes para ataque:");
            for (Personagem personagem : Personagem.getpersonagensJogo()) {
                if ((personagem.getJogador()) == Jogador.JOGADOR2) {
                    System.out
                            .println(Personagem.getpersonagensJogo().indexOf(personagem) + "." + personagem.toString());
                }
            }
            System.out.println("\nQual Oponente Você deseja atacar?");
            oponenteescolhido = entrada.nextInt();
            Personagem.getpersonagensJogo().get(personagemescolhido)
                    .atacar(Personagem.getpersonagensJogo().get(oponenteescolhido));
            if (reiJ2.getVida() > 0) {
                // MOVIMENTO J2
                System.out.println("\nÉ a vez do Jogador 2");
                System.out.println("\nJogadores para mover:");
                for (Personagem personagem : Personagem.getpersonagensJogo()) {
                    if ((personagem.getJogador()) == Jogador.JOGADOR2) {
                        System.out.println(
                                Personagem.getpersonagensJogo().indexOf(personagem) + "." + personagem.toString());
                    }
                }
                System.out.println("\nQual Jogador Você deseja mover?");
                personagemescolhido = entrada.nextInt();
                System.out.println("\nQual direção deseja mover: CIMA,BAIXO,DIREITA,ESQUERDA,NAOMOVER ?");
                direcaomovimento = entrada.next().toUpperCase();
                Personagem.getpersonagensJogo().get(personagemescolhido).andar(Direcao.valueOf(direcaomovimento));

                // ATAQUE J2
                for (Personagem personagem : Personagem.getpersonagensJogo()) {
                    if ((personagem.getJogador()) == Jogador.JOGADOR2) {
                        System.out.println(
                                Personagem.getpersonagensJogo().indexOf(personagem) + "." + personagem.toString());
                    }
                }
                System.out.println("\nCom qual personagem Você deseja atacar?");
                personagemescolhido = entrada.nextInt();

                System.out.println("\nOponentes para ataque:");
                for (Personagem personagem : Personagem.getpersonagensJogo()) {
                    if ((personagem.getJogador()) == Jogador.JOGADOR1) {
                        System.out.println(
                                Personagem.getpersonagensJogo().indexOf(personagem) + "." + personagem.toString());
                    }
                }
                System.out.println("\nQual Oponente Você deseja atacar?");
                oponenteescolhido = entrada.nextInt();
                Personagem.getpersonagensJogo().get(personagemescolhido)
                        .atacar(Personagem.getpersonagensJogo().get(oponenteescolhido));
            } else {
                System.out.println("Jogador 1 venceu");
            }
            rodadas--;
            System.out.println("rodadas=" + rodadas);
        }
        if (Jogador.JOGADOR1.getPontos() > Jogador.JOGADOR2.getPontos()) {
            System.out.println("Jogador 1 venceu com " + Jogador.JOGADOR1.getPontos());
        } else {
            System.out.println("Jogador 2 venceu " + Jogador.JOGADOR2.getPontos());
        }

        entrada.close();

    }
}
