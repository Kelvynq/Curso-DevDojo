package DevDojo;

//IF E ELSE

 public class Aula_10{
    public static void main(String[] args){
        int idade = 5;
        if(idade>=18){
            System.out.println("Maior de idade");
        }
        else{
            System.out.println("Menor de idade");
        }
        
        int idade2=52;
        String status;
        status = idade2<18 ? "Não é adulto" : "Adulto";
        System.out.println(status);
        
    }
}
