package application;

public class Arbitro {
    private String nome;
    private String funcao; // Principal ou Bandeira

    public Arbitro(String nome, String funcao) {
        this.nome = nome;
        this.funcao = funcao;
    }

    public String getNome() {
        return nome;
    }

    public String getFuncao() {
        return funcao;
    }

    @Override
    public String toString() {
        return "Arbitro [nome=" + nome + ", funcao=" + funcao + "]";
    }
}
