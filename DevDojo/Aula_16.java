package DevDojo;

// FOR, BREAK E CONTINUE

public class Aula_16 {
   public static void main(String[] args){
       System.out.println("=== EXEMPLO 1 ====");
       for(int i=0; i<=10; i++){
           if(i%2==0){
           System.out.println(i);
           }
       }
       System.out.println();
       System.out.println("=== EXEMPLO 2 ====");
    double valorTotal=30000;
    for(int parcela=1; parcela<=valorTotal; parcela++){
        double valorParcela = valorTotal/parcela;
        if(valorParcela>=1000){
            System.out.println("Em " +parcela+ " parcelas fica R$" +valorParcela);
        }else{
            System.out.println("Obrigado!");
            break;
        }
        
    }
    System.out.println();
    System.out.println("=== EXEMPLO 3 ====");
    double valorCarro = 30000;
    for (int parcela= (int) valorCarro; parcela>=1; parcela-- ){
        double valorParcela = valorTotal/ parcela;
        if(valorParcela<=1000){
            continue;
        }
        System.out.println("Em " +parcela+ " parcelas de R$" +valorParcela);        
    }
   }    
}
