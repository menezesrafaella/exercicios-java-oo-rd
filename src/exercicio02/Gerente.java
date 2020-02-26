package exercicio02;

public class Gerente extends Funcionario{
    public double bonusAnual;

    public Gerente(String nome, double salarioMensal, double bonusAnual) {
        super(nome, salarioMensal);
        this.bonusAnual = bonusAnual;
    }

    public double salarioAnual(double salarioMensal, double bonusAnual){
        double salarioGerente = salarioMensal*13 + salarioMensal*bonusAnual;
            return salarioGerente;
    }

}
