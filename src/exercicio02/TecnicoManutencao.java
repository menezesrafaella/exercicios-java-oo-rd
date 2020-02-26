package exercicio02;

public class TecnicoManutencao extends Funcionario {
    private double insalubridade;
    private double bonusAnual;

    public TecnicoManutencao(String nome, double salarioMensal, double insalubridade, double bonusAnual) {
        super(nome, salarioMensal);
        this.insalubridade = insalubridade;
        this.bonusAnual = bonusAnual;
    }

    public void salarioAnualTec(double insalubridade, double bonusAnual, double salarioMensal){
        double salarioTec = salarioMensal*insalubridade + salarioMensal + bonusAnual;
        System.out.println("O salario anual do técnico de manutenção é " + salarioTec);
    }
}
