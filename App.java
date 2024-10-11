public class App {
    public static void main(String[] args) throws Exception {
        Estoque estoque = new Estoque();
        ProdutoMolho molho = new ProdutoMolho("Molho de tomate", 15.0);
        ProdutoRefrigerante refrigerante = new ProdutoRefrigerante("Refrigerante Pepeci", 6.0);

        estoque.adicionarProduto(molho);
        estoque.adicionarProduto(refrigerante);

        molho.calcularDesconto(30);
        refrigerante.calcularDesconto(10);

        System.out.println("Preços dos produtos com desconto:");
        estoque.exibirPrecosComDesconto();

        estoque.removerProduto(molho);

        System.out.println("Lista com a remoção do molho:");
        estoque.exibirPrecosComDesconto();
    }
}
