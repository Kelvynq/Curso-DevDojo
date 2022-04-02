
package DevDojo;

//EXERCÍCIO MÉTODOS 

public class Aula_35 {
    public static void main(String[] args){
        Estudante35 estudante = new Estudante35();
        estudante.nome = "JOÃO ALFREDO";
        estudante.idade = 15;
        estudante.notas = new double[]{6,8,9};
        
        estudante.imprime();
        estudante.tirarMedia();
        
    }    
}
