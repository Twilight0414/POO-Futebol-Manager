package cmd;

import application.Jogador;
import application.Time;
import application.Arbitro;
import application.Partida;

public class Main {
    public static void main(String[] args) {
        try {
            // Criando os times
            Time time1 = new Time("Flamengo");
            Time time2 = new Time("Palmeiras");

            // Adicionando jogadores ao Time 1
            time1.adicionarJogador(new Jogador("Gabigol", 9));
            time1.adicionarJogador(new Jogador("Arrascaeta", 14));
            time1.adicionarJogador(new Jogador("Pedro", 21));

            // Adicionando jogadores ao Time 2
            time2.adicionarJogador(new Jogador("Rony", 7));
            time2.adicionarJogador(new Jogador("Gustavo Gómez", 15));
            time2.adicionarJogador(new Jogador("Dudu", 10));

            // Criando os árbitros
            Arbitro arbitroPrincipal = new Arbitro("Marcelo de Lima", "Principal");
            Arbitro bandeira1 = new Arbitro("Carlos Augusto", "Bandeira");
            Arbitro bandeira2 = new Arbitro("Rafael da Silva", "Bandeira");

            // Criando a partida
            Partida partida = new Partida(time1, time2, arbitroPrincipal, bandeira1, bandeira2);

            // Alterando o placar da partida
            partida.alterarPlacarAleatorio();
            
            // Alterar o tempo da paratida para Random
            partida.definirDuracaoAleatoria();

            // Imprimindo os detalhes da partida
            System.out.println(partida);

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}

