package DevDojo;

public class Estudante35 {
   public String nome;
   public int idade;
   public double[] notas;
   
   public void imprime(){
       System.out.println("NOME: " +this.nome);
       System.out.println("IDADE: " +this.idade);
       if(notas !=null){
       for(double nota:notas){
           System.out.print(nota+" ");
       }
       }
   }
   
   public void tirarMedia(){
       if(notas == null){
           System.out.println("Esse aluno não possui notas");
           return;
       }
       double media=0;
       for(double nota:notas){
           media += nota;
       }
       media = media/notas.length;
       
       if(media>6){
           System.out.println("\n A MÉDIA É: "+media+ "\n STATUS: APROVADO!");
       }else{
           System.out.println("\n A MÉDIA É: "+media+ "\n STATUS: REPROVADO!");
       }
       
   }
   
   public void setNome(String nome){
       this.nome = nome;
   }
   public void setIdade(int idade){
       this.idade = idade;
   }
   

    
}
