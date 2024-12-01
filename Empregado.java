package Entidades;

public class Empregado extends Pessoa {

   public  double salario;
   public String matricula;

   public Empregado(String nome, int idade, String sexo, double salario, String matricula) {
       super(nome, idade, sexo);
       this.matricula = matricula;
       this.salario = salario;
   }

   public double getSalario() {
       return salario;
   }

   public void setSalario(double  Salario) {
       this.salario = salario;
   }


   public String getMatricula() {
       return matricula;
   }

   public void setMatricula(String matricula) {
       this.matricula = matricula;
   }

   public double valorInss(){
       double valor = 0;
       if (salario <= 1302){
           valor = salario * 0.075;
       }
       else if (salario <= 2571.29){
           valor = salario * 0.09;
       }
       else if (salario <= 3856.94){
           valor = salario * 0.12;
       }
       else if (salario <= 7507.49){
           valor = salario * 0.14;
       }
       else if (salario <= 12856.50){
           valor = salario * 0.145;
       }
       else if (salario <= 25713.99){
           valor = salario * 0.165;
       }
       else if (salario <= 50140.33){
           valor = salario * 0.19;
       }
       else{
           valor =  salario * 0.22;
       }
       return valor;
   }

    public double getBonificacao() {
        double bonificacao = 0;     
        bonificacao = salario * 0.10;
        return bonificacao;
    }

    
    public double pagamentos(){
        double total = 0;
        total = salario + getBonificacao();
        return total;
    }
}