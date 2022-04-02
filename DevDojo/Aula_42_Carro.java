package DevDojo;

public class Carro42 {
    
    private String nome;
    private double velocidadeMax;
    private static double velocidadeLim = 240;

    public Carro42(String nome, double velocidadeMax) {
        this.nome = nome;
        this.velocidadeMax = velocidadeMax;
    }
    
    public void imprime(){
        System.out.println("================");
        System.out.println(this.nome);
        System.out.println("Velocidade máxima: "+this.velocidadeMax);
        System.out.println("Velocidade limite: "+velocidadeLim);
    }

    public Carro42() {
    }

    public static void setVelocidadeLim(double velocidadeLim) {
        Carro42.velocidadeLim = velocidadeLim;
    }

    public static double getVelocidadeLim() {
        return velocidadeLim;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMax() {
        return velocidadeMax;
    }

    public void setVelocidadeMax(double velocidadeMax) {
        this.velocidadeMax = velocidadeMax;
    }

   
    
    
    
}
