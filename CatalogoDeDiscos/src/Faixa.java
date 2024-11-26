public class Faixa {
    private String nomeFaixa;

    public Faixa(String nome) {
        this.nomeFaixa = nome;
    }

    public String getNomeFaixa() {
        return nomeFaixa;
    }

    public void setNomeFaixa(String nomeFaixa) {
        this.nomeFaixa = nomeFaixa;
    }

    @Override
    public String toString() {
        return nomeFaixa;
    }
}
