package Entidades;

public class Pessoa {

   String nome;
   int idade;
   String sexo;

   public Pessoa(String nome, int idade, String sexo) {
       this.nome = nome;
       this.idade = idade;
       this.sexo = sexo;
   }

   public String getNome() {
       return nome;
   }

   public void setNome(String nome) {
       this.nome = nome;
   }

   public int getIdade() {
       if (idade >= 18) {
        return idade;
       } 
        else { 
            System.out.println("Idade invalida");
            return 0;
        }
    }

   public void setIdade(int idade) {
       this.idade = idade;
   }

   public String getSexo() {
        if(sexo == "M" || sexo == "F"){
            return sexo;
        }
        else{
            return "Sexo invalido";
        }       
   }

   public void setSexo(String sexo) {
       this.sexo = sexo;
   }
}