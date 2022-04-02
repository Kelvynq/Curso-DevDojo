package DevDojo;

//MÉTODOS

public class Aula_27 {
    public static void main(String[] args){
      Aula_27_Calculadora calc = new Aula_27_Calculadora();
      calc.somaDoisNumeros();
      calc.subtraiDoisNumeros();
      calc.multiplicaDoisNumeros(5, 5);
      System.out.println(calc.divideDoisNumeros(20, 2));
      int num1 = 5;
      int num2 = 10;
      calc.alteraDoisNumeros(num1, num2);
      System.out.println("Dentro do teste");
      System.out.println("num1: "+num1);
      System.out.println("num2: "+num2);
      
      int[] numeros = {1,2,3,4,5};
      calc.somaArray(numeros);
      calc.somaVarArgs(1,2,3,4,5);
    }
}
