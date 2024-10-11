public class Produto {
    protected String nome;
    protected double preco;

    public Produto() {  }

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public void calcularDesconto(double porcentagem) {
        preco *= 1 - porcentagem / 100;
    }
    
}
