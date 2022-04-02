package DevDojo;

//BLOCOS DE INICIALIZAÇÃO

public class Aula_41 {
  public static void main(String[] args){
  Cliente41 c = new Cliente41();     
      System.out.println("\nExibindo parcelas possíveis");
      for(int parcela: c.getParcelas()){
          System.out.print(parcela + " ");
      }
  }
}
