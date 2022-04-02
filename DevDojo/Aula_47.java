package DevDojo;

//ASSOCIAÇÃO

public class Aula_47 {
   public static void main(String[] args){
       
       Aluno47 aluno1 = new Aluno47("Marcia", 27);
       Aluno47 aluno2 = new Aluno47("Felipe", 18);
       Seminario47 seminario = new Seminario47("Como ser um gato tumblr");
       Professor47 prof = new Professor47("Joã", "Roupas tumblr");
       Local47 local = new Local47("Rua: Maria Mariá", "JEFS");
       
       aluno1.setSeminario(seminario);
       aluno2.setSeminario(seminario);
       
       seminario.setProfessor(prof);
       seminario.setLocal(local);
       seminario.setAluno(new Aluno47[]{aluno1, aluno2});
       
       Seminario47[] semArray = new Seminario47[1];
       semArray[0]= seminario;
       prof.setSeminario(semArray);
       
       seminario.print();
       prof.print();
      
   } 
}
   