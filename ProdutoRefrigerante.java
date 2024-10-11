public class ProdutoRefrigerante extends Produto {

    public ProdutoRefrigerante () {  }

    public ProdutoRefrigerante(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public void calcularDesconto(double porcentagem) {
        double precoComDesconto = getPreco() * (1 - porcentagem * 2 / 100);
    }
}
