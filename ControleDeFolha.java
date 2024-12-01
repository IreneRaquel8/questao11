package scr;
import java.util.ArrayList;

import Entidades.Cliente;
import Entidades.Empregado;
import Entidades.Gerente;
import Entidades.Vendedor;  

public class ControleDeFolha {
    public static  void main(String[] args) {
        Cliente c1 = new Cliente("Jessica", 19, "F", 50 , 2005);

        System.out.println(c1.toString());

        Empregado em1 = new Empregado("João", 18, "M", 1200.0, "202309");
        Empregado em2 = new Empregado("Paulo", 18, "M", 1200.0, "202310");
        Empregado em3 = new Empregado("Bianca", 18, "F", 1200.0, "202311");
        Empregado em4 = new Empregado("Maria", 18, "F", 1200.0, "202312");

        ArrayList<Empregado> listEmpre = new ArrayList<>();

        listEmpre.add(em1);
        listEmpre.add(em2);
        listEmpre.add(em3);
        listEmpre.add(em4);
        
        Vendedor v1 = new Vendedor("Neto", 23 , "M", 1200, "202313", 10.0, 2 );
        Vendedor v2 = new Vendedor("Rodrigo", 23 , "M", 1200, "202314", 10.0, 2);
        Vendedor v3 = new Vendedor("Renato", 23 , "M", 1200, "202315", 10.0, 2);
        Vendedor v4 = new Vendedor("Mateus", 23 , "M", 1200, "202316", 10.0, 2);
        
        listEmpre.add(v1);
        listEmpre.add(v2);
        listEmpre.add(v3);
        listEmpre.add(v4);

        Gerente g1= new Gerente("Raquel", 19, "F", 2000, "33333", "azul");
        Gerente g2 = new Gerente("Irene", 19, "F", 2000, "33333", "azul");

        listEmpre.add(g1);
        listEmpre.add(g2);

        double Total = 0;

       for (Empregado empregado : listEmpre){
          Total += empregado.pagamentos();
       }

       System.out.println("Folha de pagamento, Total: " + Total );
       System.out.println("Relação dos empregados:");
       System.out.println(v1.toString());
       System.out.println(v2.toString());
       System.out.println(v3.toString());
       System.out.println(v4.toString());
       System.out.println(g1.toString());
       System.out.println(g2.toString());
       
       
       
        
      }

}