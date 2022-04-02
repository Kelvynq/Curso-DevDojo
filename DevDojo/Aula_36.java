package DevDojo;

//MÉTODOS GET E SET

public class Aula_36 {
    
    public static void main(String[] args){
       Estudante36 estudante = new Estudante36();
       estudante.setNome("Fernanda Tavares");
       estudante.setIdade(15);
       estudante.setNotas(new double[]{5,6,7});
       System.out.println(estudante.getNome());
       System.out.println(estudante.getIdade());
       System.out.println(estudante.getNotas());
          
    }
    
}
