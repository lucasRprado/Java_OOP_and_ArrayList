package uscs1;

public class Empregado {
    
    private String codigo;
    private String nome;
    private int idade;
    private Departamento departamento;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
    
   
    
    public Empregado(String codigo, String nome, int idade, Departamento departamento){
       this.codigo = codigo;
       this.nome = nome;
       this.idade = idade;
       this.departamento = departamento;
    }
    
    public Empregado(){
        
    }
    
    public void ImprimeEmpregado(){
         System.out.println("Dados do empregado:");
        System.out.println("\nNome: " + nome);
        System.out.println("Codigo: #" + codigo);
        System.out.println("Idade: " + idade);
        System.out.println("Departamento: " + departamento.getNomeDepartamento());
    }
    
}
