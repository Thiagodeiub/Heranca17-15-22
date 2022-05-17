public class Funcionario extends Pessoa {


    public double salarioBruto, inss, ir;

    Funcionario() {
        super();
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

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }


    public void setInss(double inss) {
        this.inss = inss;
    }

    public void setIr(double ir) {
        this.ir = ir;
    }


    @Override
    public String toString() {
        return super.toString()  +
                "salarioBruto=" + salarioBruto +
                ", salarioLiquido=" + calcularSalario() +
                ", inss=" + inss +
                ", ir=" + ir +
                '}';
    }
    public double calcularSalario(){


        return salarioBruto - ((salarioBruto *inss/100) + (salarioBruto * ir/100));

    }
}









