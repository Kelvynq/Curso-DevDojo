package DevDojo;

// IF ELSE

public class Aula_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double salario = 900;
        double imposto;
        if(salario < 1000){
            imposto = salario*0.05;
            System.out.println(imposto);
        } else if(salario >=1000 && salario<2000){
            imposto = salario*0.1;
            System.out.println(imposto);
        }
        else if(salario >=2000 && salario<4000){
            imposto = salario*0.15;
            System.out.println(imposto);
        }
        else if(salario >5000){
            imposto = salario*0.2;
            System.out.println(imposto);
        }
    }
}

    