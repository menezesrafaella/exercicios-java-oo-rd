package exercicio02;

public abstract class Funcionario {
    public String nome;
    public double salarioMensal;

    public Funcionario(String nome, double salarioMensal) {
        this.nome = nome;
        this.salarioMensal = salarioMensal;
    }

    public double salarioAnualFun(double salarioMensal){
    double salarioPorAno = salarioMensal*13;
        return salarioPorAno;
}}

