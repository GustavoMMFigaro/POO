public class Desenvolvedor extends Funcionario {

    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularSalario() {
        return salario;
    }

    @Override
    public String descreverResponsabilidade() {
        return this.nome + " - Desenvolvedor";
    }

    

}
