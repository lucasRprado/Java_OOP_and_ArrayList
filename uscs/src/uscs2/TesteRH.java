package uscs2;
import uscs1.Empregado;
import uscs1.Departamento;

public class TesteRH {

    public static void main(String[] args) {
        
        Departamento a = new Departamento ("10", "Compras\n");
        Empregado e = new Empregado (1, "Antonio", 35, a);
        Empregado e1 = new Empregado (2, "Ana Maria", 29, a);
        
        a.AdicionaEmpregado(e);
        a.AdicionaEmpregado(e1);
        e.ImprimeEmpregado();
        e1.ImprimeEmpregado();
        a.ImprimeEmpregado();
        
        System.out.println("Empregados do departamento\n" + a.RetornaEmpregados());
   
    }
    
}
