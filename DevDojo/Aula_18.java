package DevDojo;

// VETORES

public class Aula_18 {
   public static void main(String[] args){          
       System.out.println("=== Exemplo 1 ===");

       int[] idades = new int[3];       
       idades[0]=20;     
       idades[1]=15;
       idades[2]=30;
       
       System.out.println("Idade 1: " +idades[0]);
       System.out.println("Idade 2: " +idades[1]);
       System.out.println("Idade 3: " +idades[2]);
    
   
       String[] nomes = new String[3];
       nomes[0]= "Naruto";
       nomes[1]= "Sasuke";
       nomes[2]= "Sakura";           
       System.out.println();
       
   
       System.out.println("=== Exemplo 2 ===");
  
       for(int i=0; i<nomes.length;i++){
           System.out.println(nomes[i]);
       } 
       System.out.println();  
       
       System.out.println("=== Exemplo 3 ===");
       int[] numeros = {1,2,3,4,5};
       for(int aux : numeros){
           System.out.println(aux);
       }
       System.out.println();  
       
       System.out.println("=== Exemplo 4 ===");
       String[] pessoas = {"Harry", "Hermione", "Rony"};
          for(String nome: pessoas){
              System.out.println(nome);
          }
     System.out.println();  
       
       
     System.out.println("=== Exemplo 5 ===");
     
     int[][] dias = new int[2][2];
     dias[0][0] = 30;
     dias[0][1] = 31;
     dias[1][0] = 29;
     dias[1][1] = 28;
     
     for(int i=0; i<dias.length;i++){
         System.out.println(dias[i]);
         for(int j=0; j<dias[i].length;j++){
             System.out.println(dias[i][j]);
         }
     }
     System.out.println();
     for(int[] aux1: dias){
         for(int aux2: aux1){
             System.out.println(aux2);
         }
         
     }
     System.out.println();  
       
       System.out.println("=== Exemplo 6 ===");
       int[][] diax = new int[3][];
       diax[0] = new int[2];
       diax[1] = new int[]{1,2,3};
       diax[2] = new int[4];
       
       for(int[] aux3 : diax){
           for(int aux4 : aux3){
               System.out.println(aux4);
           }
       }
       
       
   }  
}