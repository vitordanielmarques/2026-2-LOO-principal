package Dominio;

public class ProfessorEfetivo extends Professor{
    private Double trienio;

    public Double getTrienio() {
        return trienio;
    }

    public void setTrienio(Double trienio) {
        this.trienio = trienio;
    }

    @Override
    public Double calcularBonificacao(){
        return (this.getSalario() * 0.10) + this.trienio;
    }

    @Override
    public void exibir() {
        System.out.println("[PROFESSOR EFETIVO] Código: " + this.codigo);
        System.out.println("[PROFESSOR EFETIVO] Nome: " + this.nome);
        System.out.println("[PROFESSOR EFETIVO] CPF: " + this.cpf);
        System.out.println("[PROFESSOR EFETIVO] Salário: " + this.getSalario());
        System.out.println("[PROFESSOR EFETIVO] Triênio: " + this.trienio);
        System.out.println("[PROFESSOR EFETIVO] Bonificação: " + this.calcularBonificacao());
    }

    public ProfessorEfetivo(){}

    public ProfessorEfetivo(int codigo,
        String nome,
        String cpf,
        Double salario,
        Double trienio){
        super(codigo, nome, cpf, salario);
        this.trienio = trienio;
    }
}
