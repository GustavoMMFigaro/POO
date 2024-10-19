public class SistemaRH {
    public static void main(String[] args) {
        Desenvolvedor desenvolvedor = new Desenvolvedor("Leonardo", 3500);
        Gerente gerente = new Gerente("Maurício", 10000);

        System.out.println("O salário é de: R$" + desenvolvedor.calcularSalario());
        System.out.println(desenvolvedor.descreverResponsabilidade());

        System.out.println("O salário é de: R$" + gerente.calcularSalario());
        System.out.println(gerente.descreverResponsabilidade());
    }
}
