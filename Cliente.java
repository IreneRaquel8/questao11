package Entidades;
public class Cliente extends Pessoa {

   double valorDivida;
   int anoNascim;

   public Cliente(String nome, int idade, String sexo, double valorDivida, int anoNascim) {
       super(nome, idade, sexo);
       this.valorDivida = valorDivida;
       this.anoNascim = anoNascim;
   }

   public double  getValorDivida() {
       return valorDivida;
   }

   public void setValorDivida(double valorDivida) {
       this.valorDivida = valorDivida;
   }


   public int anoNascim() {
       return anoNascim;
   }

   public void setAnoNascim(int anoNascim) {
       this.anoNascim = anoNascim;
   }   
   
   public String toString() {
       return "Cliente: Nome: " + nome + ", idade: " + idade + ", Sexo: " + sexo + ", Valor da divida: " + valorDivida + ", Ano de nascimento: " + anoNascim;
   }
}


