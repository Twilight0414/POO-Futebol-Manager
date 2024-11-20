package cmd;
import java.util.Scanner;
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
            time1.adicionarJogador(new Jogador("Gabigol", "Atacante", 9));
            time1.adicionarJogador(new Jogador("Arrascaeta", "Meia", 14));
            time1.adicionarJogador(new Jogador("Pedro", "Atacante", 21));
            time1.adicionarJogador(new Jogador("Everton Ribeiro", "Meia", 7));
            time1.adicionarJogador(new Jogador("Bruno Henrique", "Atacante", 27));
            time1.adicionarJogador(new Jogador("Thiago Maia", "Volante", 8));
            time1.adicionarJogador(new Jogador("David Luiz", "Zagueiro", 23));
            time1.adicionarJogador(new Jogador("Rodrigo Caio", "Zagueiro", 3));
            time1.adicionarJogador(new Jogador("Filipe Luís", "Lateral", 16));
            time1.adicionarJogador(new Jogador("Diego Alves", "Goleiro", 1));

            // Adicionando jogadores ao Time 2
            time2.adicionarJogador(new Jogador("Messi", "Atacante", 10));
            time2.adicionarJogador(new Jogador("Mbappé", "Atacante", 7));
            time2.adicionarJogador(new Jogador("Neymar", "Atacante", 11));
            time2.adicionarJogador(new Jogador("Sergio Ramos", "Zagueiro", 4));
            time2.adicionarJogador(new Jogador("Hakimi", "Lateral", 2));
            time2.adicionarJogador(new Jogador("Marquinhos", "Zagueiro", 5));
            time2.adicionarJogador(new Jogador("Verratti", "Volante", 6));
            time2.adicionarJogador(new Jogador("Donnarumma", "Goleiro", 99));
            time2.adicionarJogador(new Jogador("Di Maria", "Meia", 22));
            time2.adicionarJogador(new Jogador("Paredes", "Volante", 8));


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
            
            partida.aplicarCartoesAleatorios();

            // Imprimindo os detalhes da partida
            System.out.println(partida);
            
            //Interação com o Usuario - Quais jogadores jogaram na partida
            Scanner scanner = new Scanner(System.in);
            String escolha;
            
            do {
            	System.out.println("De qual time você quer ver os jogadores? Digite o nome do time:");
            	String timeEscolhido = scanner.nextLine();
            
            
            	//If simples que se o usuario digitou o nome do time 1, irá mostrar os dados do time 1
            	if (timeEscolhido.equalsIgnoreCase(time1.getNome())) {
            		System.out.println("Jogadores do " + time1.getNome() + ":");
            		for (Jogador jogador : time1.getJogadores()) {
            			System.out.println(" - " + jogador.getNome() + " (Camisa " + jogador.getNumero() + ")" + " - " + jogador.getPosicao());
            		}
            	} else if (timeEscolhido.equalsIgnoreCase(time2.getNome())) { //se não, se foi digitado o nome do time 2
            		System.out.println("Jogadores do " + time2.getNome() + ":");
            		for (Jogador jogador : time2.getJogadores()) {
            			System.out.println(" - " + jogador.getNome() + " (Camisa " + jogador.getNumero() + ")"  + " - " + jogador.getPosicao());
            		}
            	} else {
            		System.out.println("Time não Encontrado");
            	}
            
            	System.out.println("\nDeseja ver mais jogadores? (s/n)");
            	escolha = scanner.nextLine();
        } while (escolha.equalsIgnoreCase("s"));
        
        	System.out.println("Programa encerrado. Até a proxima!");
            
            scanner.close();

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}

