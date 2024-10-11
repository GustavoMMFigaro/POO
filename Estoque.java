import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private List<Produto> produtos;

    public Estoque() {
        produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void removerProduto(Produto produto) {
        produtos.remove(produto);
    }

    public void exibirPrecosComDesconto() {
        for (Produto produto : produtos) {
            double precoComDesconto = produto.getPreco();
            System.out.printf("Produto: %s | Preço com desconto: %.2f\n", produto.getNome(), precoComDesconto);
        }
    }
}