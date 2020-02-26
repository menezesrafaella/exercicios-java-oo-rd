package exercicio02;

public class AuxiliarEscritorio extends Funcionario{
    public double bonusSalarial;

    public AuxiliarEscritorio(String nome, double salarioMensal, double bonusSalarial) {
        super(nome, salarioMensal);
        this.bonusSalarial = bonusSalarial;
    }


    public static double salarioAnualAux(double salarioMensal, double bonusSalarial ){
        double salarioAux= salarioMensal*13 + bonusSalarial;
            return salarioAux;
    }
}
