package DevDojo;

//MÉTDO GET E SET

public class Estudante36 {
   private String nome;
   private int idade;
   private double[] notas;
   private boolean aprovado;
            
     public void setNome(String nome){
       this.nome = nome;
   }
   public void setIdade(int idade){
     if(idade<0){
         System.out.println("Voçê não pode fazer isso");
         return;
     }  
       this.idade = idade;
   }
   public void setNotas(double[] notas){
       this.notas = notas;
   }
   public String getNome(){
       return this.nome;
   }
   public int getIdade(){
       return this.idade;
   }
   public double[] getNotas(){
       return this.notas;
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
           this.aprovado = true;
           System.out.println("\n A MÉDIA É: "+media+ "\n STATUS: APROVADO!");
       }else{
           this.aprovado = false;
           System.out.println("\n A MÉDIA É: "+media+ "\n STATUS: REPROVADO!");
       }
       
   }
  
   public boolean isAprovado(){
       return this.aprovado;
   }
}
