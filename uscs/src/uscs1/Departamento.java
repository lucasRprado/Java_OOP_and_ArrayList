
package uscs1;
import java.util.ArrayList;

public class Departamento {
    
    private String codDepto;
    private String descricao;
    private ArrayList <Empregado> lista_de_empregados;
    
    public String getCodDepto(){
        return codDepto;
    }

    public void setCodDepto(String codDepto) {
        this.codDepto = codDepto;
    }
    
  public String getDescricao(){
      return descricao;
  }
  
  public void setDescricao(String descricao){
      this.descricao = descricao;
  }
    
  public Departamento(String codDepto, String descricao){
      this.codDepto = codDepto;
      this.descricao = descricao;
      this.lista_de_empregados = new ArrayList <Empregado>();
  }
  
  public Departamento(){
      
  }
  
  public void ImprimeEmpregado(){
      System.out.println("Codigo do departamento: " + codDepto);
      System.out.println("Descricao: " + descricao);
  }
  
  public void AdicionaEmpregado (Empregado e){
      this.lista_de_empregados.add(e);
  }
  
  public String RetornaEmpregados(){
      String lista = "";
      for (int i = 0; i < this.lista_de_empregados.size(); i++)
          lista += this.lista_de_empregados.get(i).getNome()+"\n";
      return lista;
  }

  
  


}
