package DevDojo;

//MODIFICADOR STATIC 
public class Aula_42 {
    
    public static void main(String[] args){
        Carro42.setVelocidadeLim(220);
        Carro42 c1 = new Carro42("BMW", 280);
        Carro42 c2 = new Carro42("Audi", 275);
        Carro42 c3 = new Carro42("Mercedes", 290);
        
        c1.imprime();
        c2.imprime();
        c3.imprime();
        
        System.out.println("#####################\n");
       
        c1.imprime();
        c2.imprime();
        c3.imprime();           
    }
}
