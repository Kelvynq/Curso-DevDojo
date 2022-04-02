package DevDojo;

public class Professor47 {
    
    private String nome;
    private String especialidade;
    private Seminario47[] seminario;

    public Professor47(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor47() {
    }
    
    public void print(){
        System.out.println("------ Relatório de professores ------");
        System.out.println("Nome do professor: "+this.nome);
        System.out.println("Especialidade: "+this.especialidade);
        System.out.println("==Seminários participantes");
        if(seminario !=null && seminario.length!=0){
        for(Seminario47 seminarios : seminario){
            System.out.println(seminarios.getTitulo() +" ");
        }
        return;
    }
        System.out.println("Professor não vinculado a nenhum seminário");
    }
    
    public Seminario47[] getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario47[] seminario) {
        this.seminario = seminario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }   
}