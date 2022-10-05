
package uscs1;

public class Empregado {
    
    private int codEmpregado;
    private String nome;
    private int idade;
    private Departamento departamento;

    public int getCodEmpregado() {
        return codEmpregado;
    }

    public void setCodEmpregado(int codEmpregado) {
        this.codEmpregado = codEmpregado;
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

    public Empregado(int codEmpregado, String nome, int idade, Departamento departamento) {
        this.codEmpregado = codEmpregado;
        this.nome = nome;
        this.idade = idade;
        this.departamento = departamento;
    }
       
    public Empregado(){
        
    }
    
    public void ImprimeEmpregado(){
        System.out.println("\nInformacoes do empregado:");
        System.out.println("Codigo do empregado: " + codEmpregado);
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Departamento: " + departamento.getDescricao());
    }
    
    
}
