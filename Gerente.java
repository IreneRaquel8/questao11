package Entidades;

public class Gerente extends Empregado{

   public  String nomeGerencia;

   public Gerente(String nome, int idade, String sexo, double salario, String matricula, String nomeGerencia) {
       super(nome, idade, sexo, salario, matricula);
       this.nomeGerencia =  nomeGerencia;
   }

   public String getNomeGerencia() {
       return nomeGerencia;
   }

   public void setNomeGerencia(String nomeGerencia) {
       this.nomeGerencia = nomeGerencia;
   }

    public double getBonificacao() {
        double bonificacaoG = 0;
        bonificacaoG = salario * 0.10 + 1000;
        return bonificacaoG;
    }

   @Override
   public String toString() {
       return "Gerente: nome: " + nome + ", idade:" + idade + ", matricula: " + matricula + ", Nome da Gerencia: " + nomeGerencia + ", Valor do INSS: " + valorInss() + " ";
   }
}









