package Dominio;

public class Professor extends AbsPessoa {
    private Double salario;

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Double calcularBonificacao(){
        return (this.salario * 0.10);
    }

    @Override
    public void exibir() {
        System.out.println("[PROFESSOR] Código: " + this.codigo);
        System.out.println("[PROFESSOR] Nome: " + this.nome);
        System.out.println("[PROFESSOR] CPF: " + this.cpf);
        System.out.println("[PROFESSOR] Salário: " + this.salario);
        System.out.println("[PROFESSOR] Bonificação: " + this.calcularBonificacao());
    }

    public Professor(){}

    public Professor(int codigo, String nome, String cpf, Double salario){
        super(codigo, nome, cpf);
        this.salario = salario;
    }
}
