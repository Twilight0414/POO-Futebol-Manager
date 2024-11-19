package application;

public class Jogador {
    private String nome;
    private int numero;

    public Jogador(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "Jogador [nome=" + nome + ", numero=" + numero + "]";
    }
}
