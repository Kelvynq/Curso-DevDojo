package DevDojo;

public class Local47 {
    
    private String rua;
    private String bairro;

    public Local47(String rua, String bairro) {
        this.rua = rua;
        this.bairro = bairro;
    }

    public Local47() {
    }
    
    public void print(){
                System.out.println("------ Relatório de local ------");

        System.out.println(" " +this.rua);
        System.out.println("Bairro: " +this.bairro);
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    
    
}
