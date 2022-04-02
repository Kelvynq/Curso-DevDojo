package DevDojo;

public class Estudante40 {
    
    private String matricula;
    private String nome;
    private double[] notas;
    private String dataMatricula;
    
    public Estudante40(String matricula, String nome, double[] notas){
        this.matricula = matricula;
        this.nome = nome;
        this.notas = notas;        
    }
    
    public Estudante40(String matricula, String nome, double[] notas, String dataMatricula){
        this(matricula, nome, notas);
        this.dataMatricula = dataMatricula;
    }
    
    public Estudante40(){
        
    }
    
    public void imprime(){    
        System.out.println(this.matricula);
        System.out.println(this.nome);
        for(double nota:notas){
            System.out.println(nota+ " ");
        }
        System.out.println(this.dataMatricula);
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public String getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }   
}