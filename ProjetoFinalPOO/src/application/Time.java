package application;

import java.util.ArrayList;
import java.util.List;

public class Time {
    private String nome;
    private List<Jogador> jogadores;

    public Time(String nome) {
        this.nome = nome;
        this.jogadores = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public List<Jogador> getJogadores() {
        return jogadores;
    }

    public void adicionarJogador(Jogador jogador) {
        if (jogadores.size() < 11) {
            jogadores.add(jogador);
        } else {
            System.out.println("O time já possui 11 jogadores!");
        }
    }

    @Override
    public String toString() {
        return "Time [nome=" + nome + ", jogadores=" + jogadores + "]";
    }
}
