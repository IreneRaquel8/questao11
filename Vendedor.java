package Entidades;
public class Vendedor extends Empregado{

   private  double valorVendas;
   private  int qntVendas;

   public Vendedor(String nome, int idade, String sexo, double salario, String matricula, double valorVendas, int qntVendas) {
       super(nome, idade, sexo, salario, matricula);
       this.valorVendas = valorVendas;
       this.qntVendas = qntVendas;
   }

   public double getValorVendas() {
       return valorVendas;
   }

   public void setValorVendas() {
       this.valorVendas = valorVendas;
   }

   public int getQntVendas() {
       return qntVendas;
   }

   public void setQntVendas() {
       this.qntVendas = qntVendas;
   }

   @Override
   public String toString() {
       return "Vendedor: nome: " + nome + ", salario: " + salario + ", Valor das vendas: " + valorVendas + ", Quantidade de vendas: " + qntVendas ;
   }

   public double getBonificacao() {
        double bonificacaoV = 0;
        bonificacaoV = salario * 0.10 + (qntVendas * 2);
        return bonificacaoV;
    }   
}
