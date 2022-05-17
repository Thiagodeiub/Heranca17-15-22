public class FuncionarioTerceirizado extends Funcionario {

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double bonus;



    public FuncionarioTerceirizado() {
    }

    @Override
    public String getDataDeNascimento() {
        return super.getDataDeNascimento();
    }

    @Override
    public void setDataDeNascimento(String dataDeNascimento) {
        super.setDataDeNascimento(dataDeNascimento);
    }

    @Override
    public Long getCpf() {
        return super.getCpf();
    }

    @Override
    public void setCpf(Long cpf) {
        super.setCpf(cpf);
    }

    @Override
    public int getIdade() {
        return super.getIdade();
    }

    @Override
    public void setIdade(int idade) {
        super.setIdade(idade);
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    @Override
    public void setSalarioBruto(double salarioBruto) {
        super.setSalarioBruto(salarioBruto);
    }

    @Override
    public void setInss(double inss) {
        super.setInss(inss);
    }

    @Override
    public void setIr(double ir) {
        super.setIr(ir);
    }


    @Override
    public double calcularSalario() {
        return super.calcularSalario();
    }


    public double bonificacao() {


        return   calcularSalario() + calcularSalario() * bonus;

    }

    @Override
    public String toString() {
        return "FuncionarioTerceirizado{" +
                "salarioBruto=" + salarioBruto +
                ", inss=" + inss +
                ", ir=" + ir +
                ", bonus=" + bonus +
                ", nome='" + nome + '\'' +
                ", dataDeNascimento='" + dataDeNascimento + '\'' +
                ", cpf=" + cpf +
                ", idade=" + idade +
                ", salario total="+ bonificacao()+
                '}';
    }
}





