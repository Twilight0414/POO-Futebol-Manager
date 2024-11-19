package application;
import java.util.Random; //importar o pacote random do java


public class Partida {
    private Time time1;
    private Time time2;
    private Arbitro arbitroPrincipal;
    private Arbitro bandeira1;
    private Arbitro bandeira2;
    private int placarTime1;
    private int placarTime2;
    private String duracaoPartida; // Exemplo: "90 minutos" ou "1º tempo"

    public Partida(Time time1, Time time2, Arbitro arbitroPrincipal, Arbitro bandeira1, Arbitro bandeira2) {
        this.time1 = time1;
        this.time2 = time2;
        this.arbitroPrincipal = arbitroPrincipal;
        this.bandeira1 = bandeira1;
        this.bandeira2 = bandeira2;
        this.placarTime1 = 0;
        this.placarTime2 = 0;
        this.duracaoPartida = "Não Definida";
 
    }

    //public void alterarPlacar(int golsTime1, int golsTime2) {
        //this.placarTime1 = golsTime1;
       // this.placarTime2 = golsTime2;
    //}
    
    public void alterarPlacarAleatorio() {
        Random random = new Random();
        this.placarTime1 = random.nextInt(6); // Gols entre 0 e 5 para Time 1
        this.placarTime2 = random.nextInt(6); // Gols entre 0 e 5 para Time 2
    }
    
    public void definirDuracaoAleatoria() {
        String[] duracoes = {"45 minutos (1º tempo)", "90 minutos", "120 minutos (prorrogação)", "Encerrada no intervalo", "Encerrada com os Penaltes"};
        Random random = new Random();
        this.duracaoPartida = duracoes[random.nextInt(duracoes.length)];
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
        	   "Duração da Partida: " + duracaoPartida + "\n";
        
    }

}

