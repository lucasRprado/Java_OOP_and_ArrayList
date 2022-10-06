package uscs1;
import java.util.ArrayList;

public class Departamento {
    
    private String codigoDepartamento;
    private String nomeDepartamento;
    private ArrayList<Empregado>lista_de_empregados;

    public String getCodigoDepartamento() {
        return codigoDepartamento;
    }

    public void setCodigoDepartamento(String codigoDepartamento) {
        this.codigoDepartamento = codigoDepartamento;
    }

    public String getNomeDepartamento() {
        return nomeDepartamento;
    }

    public void setNomeDepartamento(String nomeDepartamento) {
        this.nomeDepartamento = nomeDepartamento;
    }
   
    
    public Departamento(String codigoDepartamento, String nomeDepartamento){
        this.codigoDepartamento = codigoDepartamento;
        this.nomeDepartamento = nomeDepartamento;  
        this.lista_de_empregados = new ArrayList <Empregado>();
    }
    
    public Departamento(){
        
    }
    
    public void ImprimeDepartamento(){
        System.out.println("Informacoes do departamento: ");
        System.out.println("Codigo: #" + codigoDepartamento);
        System.out.println("Nome: " + nomeDepartamento);
    }
    
    public void AdicionaEmpregado(Empregado e){
        this.lista_de_empregados.add(e);
    }
    
    public String RetornaEmpregados(){
        String lista = "";
        for (int i = 0; i < this.lista_de_empregados.size(); i++)
            lista += this.lista_de_empregados.get(i).getNome()+"\n";
        return lista;
    }
}
