package application;

public class Jogador {
    private String nome;
    private String posicao; // Nova variável para posição do jogador
    private int numero;

    // Construtor
    public Jogador(String nome, String posicao, int numero) {
        if (nome == null || nome.isEmpty()) {
            throw new IllegalArgumentException("Nome do jogador não pode ser vazio.");
        }
        if (numero < 1 || numero > 99) {
            throw new IllegalArgumentException("Número do jogador deve estar entre 1 e 99.");
        }
        this.nome = nome;
        this.posicao = posicao;
        this.numero = numero;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getPosicao() {
        return posicao;
    }
    
    public int getNumero() {
        return numero;
    }

    // Método toString atualizado
    @Override
    public String toString() {
        return "Jogador [nome=" + nome + ", posição=" + posicao + ", numero=" + numero + "]";
    }
}
