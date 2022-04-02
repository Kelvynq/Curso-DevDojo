package DevDojo;

public class Cliente41 {
    
    private int[] parcelas;
    
    {
        parcelas = new int[100]; 
        System.out.println("Dentro do bloco de inicialização");
        for(int i=1; i<=100; i++){
            parcelas[i-1]=i;
        }
    }
    public Cliente41(){
        System.out.print("Dentro do construtor\n");
        for(int parcela: this.parcelas){
          System.out.print(parcela + " ");
        }   
    }   

    public int[] getParcelas() {
        return parcelas;
    }

    public void setParcelas(int[] parcelas) {
        this.parcelas = parcelas;
    }        
}