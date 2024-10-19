abstract class Funcionario implements IFuncionario {
    public String nome;
    public double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }


    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }
}
