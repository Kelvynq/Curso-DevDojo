package DevDojo;

//CLASSES 

public class Aula_26 {
  public static void main(String[] args){
      Aula_26_Professor professor = new Aula_26_Professor();
      professor.cpf = 123456;
      professor.matricula = 101010;
      professor.nome = "Aline";
      professor.rg = 112233;
      
      Aula_26_Professor professor2 = new Aula_26_Professor();
      professor2.cpf = 654321;
      professor2.matricula = 202020;
      professor2.nome = "Junior";
      professor2.rg = 665544;
      
      System.out.println(professor.nome);
      System.out.println(professor.matricula);
      System.out.println(professor.cpf);
      System.out.println(professor.rg);
      System.out.println("===============");
      
      System.out.println(professor2.nome);
      System.out.println(professor2.matricula);
      System.out.println(professor2.cpf);
      System.out.println(professor2.rg);

  }   
}
