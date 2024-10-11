public class ProdutoMolho extends Produto {
    
    public ProdutoMolho() {  }

    public ProdutoMolho(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public void calcularDesconto(double porcentagem) {
        double precoComDesconto = getPreco() * (1 - porcentagem * 1.25 / 100);
    }
}
