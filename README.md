1. Defina um package chamado uscs1. Neste package defina uma classe em Java chamada “Empregado”
para armazenar as informações de um empregado. A classe deve armazenar o código do empregado,
seu nome e sua idade. Um empregado sempre está alocado em um departamento. Considerar para
esta classe os conceitos da Programação Orientada a Objetos referentes ao ENCAPSULAMENTO. O
método construtor deve receber o código do empregado, seu nome e sua idade. Definir também um
construtor sem parâmetros. Deve oferecer ainda uma função chamada “ImprimeEmpregado()” que
imprime as informações do empregado.
2. No mesmo package uscs1, defina uma classe em Java chamada “Departamento” para armazenar as
informações de um departamento da empresa. A classe deve armazenar o código do departamento e
sua descrição. Considerar para esta classe os conceitos da Programação Orientada a Objetos referentes
ao ENCAPSULAMENTO. O método construtor deve receber o código do departamento e sua descrição.
Definir também um construtor sem parâmetros. Deve oferecer ainda uma função chamada
“ImprimeDepartamento()” que imprime as informações do departamento.
3. Um empregado sempre está alocado em um único departamento. Altere a classe “Empregado” e inclua
na mesma um atributo que define o departamento que o empregado trabalha. Isto permitirá se associar
a classe “Empregado” à classe “Departamento”, ou seja, mapear um empregado a seu departamento.
Alterar o construtor de Empregados para que seja refletida essa associação. Alterar também a função
“ImprimeEmpregado()”.
4. Um departamento pode ter zero ou mais empregados. Altere a classe “Departamento” e inclua na
mesma um atributo que define a lista de empregados que o departamento possui. Defina para este
atributo uma lista do tipo ArrayList. A definição deve ser feita por meio de :
private ArrayList<Empregado> lista_de_empregados;

Inserir na classe a declaração: import java.util.ArrayList; Ao se criar um departamento, deve-se
instanciar o correspondente ArrayList, por meio da declaração:

this.lista_de_empregados = new ArrayList<Empregado>();

Criar na classe “Departamento” uma função chamada “AdicionaEmpregado (Empregado e)” que
adiciona um empregado na lista de empregados do departamento.
public void AdicionaEmpregado(Empregado e) {
this.lista_de_empregados.add(e) }

Criar na classe “Departamento” uma função chamada “RetornaEmpregados()” que retorna a lista de
empregados alocados no departamento.
public String RetornaEmpregados() {
String lista = null;
for (int i=0; i<this.lista_de_empregados.size(); i++)
lista += this.lista_de_empregados.get(i).getNomeEmpregado()+”\n”;
return lista; }

5. Defina um package chamado uscs2. Nesse package defina uma classe chamada “TesteRH” que possui
um método main() para instanciar departamentos e empregados. Criar um departamento chamado
“Compras” com código=10 e alocar neste departamento os empregados: (1,”Antonio”, 35, “Compras”)
e (2, “Ana Maria”, 29, “Compras”. Imprimir os dados dos empregados, do departamento e empregados
alocados no departamento.
