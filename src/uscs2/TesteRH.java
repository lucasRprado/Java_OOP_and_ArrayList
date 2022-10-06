package uscs2;
import uscs1.Departamento;
import uscs1.Empregado;

public class TesteRH {
    
    public static void main (String[]args){
        
        Departamento d1 = new Departamento("10", "Compras\n");
        Departamento d2 = new Departamento("5", "Vendas\n");
        Empregado e1 = new Empregado("1", "Antonio", 35, d1);
        Empregado e2 = new Empregado("2", "Ana Clara", 25, d2);
        
        d1.AdicionaEmpregado(e1);
        d2.AdicionaEmpregado(e2);
        e1.ImprimeEmpregado();
        e2.ImprimeEmpregado();
        d1.ImprimeDepartamento();
        d2.ImprimeDepartamento();
        
        System.out.println("Empregados do departamento: \n" + d1.getNomeDepartamento() + "\n" + d1.RetornaEmpregados());
        System.out.println("Empregados do departamento: \n" + d2.getNomeDepartamento() + "\n" + d2.RetornaEmpregados());
        
        
    }
    
}
