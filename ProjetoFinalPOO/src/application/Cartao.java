package application;

public class Cartao {
    private String tipo; // "Amarelo" ou "Vermelho"
    private String motivo;
    private Jogador jogador;
    private int minuto; // Minuto em que o cartão foi aplicado

    // Construtor
    public Cartao(String tipo, String motivo, Jogador jogador, int minuto) {
        if (!tipo.equalsIgnoreCase("Amarelo") && !tipo.equalsIgnoreCase("Vermelho")) {
            throw new IllegalArgumentException("Tipo de cartão inválido. Use 'Amarelo' ou 'Vermelho'.");
        }
        this.tipo = tipo;
        this.motivo = motivo;
        this.jogador = jogador;
        this.minuto = minuto;
    }

    // Getters e Setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if (!tipo.equalsIgnoreCase("Amarelo") && !tipo.equalsIgnoreCase("Vermelho")) {
            throw new IllegalArgumentException("Tipo de cartão inválido. Use 'Amarelo' ou 'Vermelho'.");
        }
        this.tipo = tipo;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public Jogador getJogador() {
        return jogador;
    }

    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    // Método para exibir detalhes do cartão
    @Override
    public String toString() {
        return "Cartão [Tipo: " + tipo + ", Jogador: " + jogador.getNome() +
               ", Minuto: " + minuto + ", Motivo: " + motivo + "]";
    }
}

