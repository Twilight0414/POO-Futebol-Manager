package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Partida {
    private Time time1;
    private Time time2;
    private Arbitro arbitroPrincipal;
    private Arbitro bandeira1;
    private Arbitro bandeira2;
    private int placarTime1;
    private int placarTime2;
    private String duracaoPartida;
    private List<Cartao> cartoes;

    public Partida(Time time1, Time time2, Arbitro arbitroPrincipal, Arbitro bandeira1, Arbitro bandeira2) {
        this.time1 = time1;
        this.time2 = time2;
        this.arbitroPrincipal = arbitroPrincipal;
        this.bandeira1 = bandeira1;
        this.bandeira2 = bandeira2;
        this.placarTime1 = 0;
        this.placarTime2 = 0;
        this.duracaoPartida = "Não Definida";
        this.cartoes = new ArrayList<>();
    }

    public void alterarPlacarAleatorio() {
        Random random = new Random();
        this.placarTime1 = random.nextInt(6);
        this.placarTime2 = random.nextInt(6);
    }

    public void definirDuracaoAleatoria() {
        String[] duracoes = {"45 minutos (1º tempo)", "90 minutos", "120 minutos (prorrogação)", "Encerrada no intervalo", "Encerrada com os Penaltes"};
        Random random = new Random();
        this.duracaoPartida = duracoes[random.nextInt(duracoes.length)];
    }

    public void aplicarCartoesAleatorios() {
        Random random = new Random();

        // Simular a aplicação de até 5 cartões aleatórios
        int qtdCartoes = random.nextInt(6); // Quantidade de cartões entre 0 e 5

        for (int i = 0; i < qtdCartoes; i++) {
            // Escolher aleatoriamente um time e um jogador
            Time timeEscolhido = random.nextBoolean() ? time1 : time2;
            List<Jogador> jogadores = timeEscolhido.getJogadores();
            if (jogadores.isEmpty()) continue;

            Jogador jogadorEscolhido = jogadores.get(random.nextInt(jogadores.size()));

            // Escolher aleatoriamente o tipo e motivo do cartão
            String[] tipos = {"Amarelo", "Vermelho"};
            String[] motivos = {"Falta dura", "Reclamação", "Mão na bola", "Simulação", "Entrada violenta"};
            String tipo = tipos[random.nextInt(tipos.length)];
            String motivo = motivos[random.nextInt(motivos.length)];

            // Determinar o minuto da partida em que o cartão foi aplicado
            int minuto = random.nextInt(91); // Minuto entre 0 e 90

            // Adicionar o cartão à lista
            Cartao cartao = new Cartao(tipo, motivo, jogadorEscolhido, minuto);
            cartoes.add(cartao);
        }
    }

    public void exibirCartoes() {
        if (cartoes.isEmpty()) {
            System.out.println("Nenhum cartão aplicado nesta partida.");
        } else {
            System.out.println("Cartões aplicados:");
            for (Cartao cartao : cartoes) {
                System.out.println(cartao);
            }
        }
    }

    public String getDuracaoPartida() {
        return duracaoPartida;
    }

    @Override
    public String toString() {
        return "Detalhes da Partida:\n" +
               "Times:\n" +
               " - Time 1: " + time1.getNome() + "\n" +
               " - Time 2: " + time2.getNome() + "\n" +
               "Placar: " + time1.getNome() + " " + placarTime1 + " x " + placarTime2 + " " + time2.getNome() + "\n" +
               "Árbitros:\n" +
               " - Principal: " + arbitroPrincipal.getNome() + "\n" +
               " - Bandeira 1: " + bandeira1.getNome() + "\n" +
               " - Bandeira 2: " + bandeira2.getNome() + "\n" +
               "Duração da Partida: " + duracaoPartida + "\n" +
               "Cartões:\n" + (cartoes.isEmpty() ? "Nenhum cartão aplicado." : listarCartoes()) + "\n";
    }

    private String listarCartoes() {
        StringBuilder sb = new StringBuilder();
        for (Cartao cartao : cartoes) {
            sb.append(" - ").append(cartao).append("\n");
        }
        return sb.toString();
    }
}
