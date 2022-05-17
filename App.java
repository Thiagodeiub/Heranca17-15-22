import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        FuncionarioTerceirizado funcionario = new FuncionarioTerceirizado();

        System.out.println("nome");
        funcionario.setNome(scan.nextLine());
        System.out.println("idade");
        funcionario.setIdade(scan.nextInt());
        System.out.println("cpf");
        funcionario.setCpf(scan.nextLong());
        System.out.println("Data de nascimento");
        scan.nextLine();
        funcionario.setDataDeNascimento(scan.nextLine());

        System.out.println("*************************************************");
        System.out.println("Salario Bruto");
        funcionario.setSalarioBruto(scan.nextDouble());
        System.out.println("Porcentagem Inss");
        funcionario.setInss(scan.nextDouble());
        System.out.println("porcentagem Ir");
        funcionario.setIr(scan.nextDouble());
        System.out.println("bonus");
        funcionario.setBonus(scan.nextDouble());


        System.out.println(funcionario);









        //Crie um programa e crie uma classe pessoa com os atributos nome, idade, data de nascimento, cpf.
        // Uma classe funcionário herdando os atributos da classe pessoa e contento o salario bruto, inss (5%) , ir (11%),
        // e salario liquido. Uma classe funcionário terceirizado, onde herda os atributos da classe pessoa,
        // e tem mais o atributo de salario Bruto e salario liquido,
        // e tem o desconto de inss (5%), ir (11%) e uma bonificação (10% por ser terceirizado);

    }
}
