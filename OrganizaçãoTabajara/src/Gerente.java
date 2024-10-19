public class Gerente extends Funcionario {

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularSalario() {
        return salario;
    }

    @Override
    public String descreverResponsabilidade() {
        return this.nome + " - Gerente";
    }
    

    
}
