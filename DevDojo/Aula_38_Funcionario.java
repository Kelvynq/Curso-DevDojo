package DevDojo;

public class Funcionario38 {

  private String nome;
  private String cpf; 
  private double salario;
  private String rg;
  
  public Funcionario38(String nome, String cpf, double salario, String rg){
      this.nome = nome; 
      this.cpf = cpf;
      this.salario = salario;
      this.rg = rg;
  }
  
  public Funcionario38(){
      
  }
  public void setNome(String nome){
      this.nome = nome;
  } 
  public String getNome(){
      return this.nome;   
  }  

  public void setCpf(String cpf){
      this.cpf = cpf;
  }
  public String getCpf(){
      return this.cpf;
  }
  
  public void SetSalario(double salario){
      this.salario = salario;
  }
  public double getSalario(){
      return this.salario;
  }
  
  public void SetRg(String rg){
      this.rg = rg;
  }
  public String getRg(){
      return this.rg;
  }
  
  public void imprime(){
      System.out.println(this.nome);
      System.out.println(this.cpf);
      System.out.println(this.salario);
      System.out.println(this.rg);
  }
  
  public void init(String nome, String cpf, double salario){
      this.nome = nome;
      this.cpf = cpf;
      this.salario = salario;
  }
  
  public void init(String nome, String cpf, double salario, String rg){
      init(nome,cpf,salario);
      this.rg= rg;
  }
}
