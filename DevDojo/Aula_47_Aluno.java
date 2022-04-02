package DevDojo;

public class Aluno47 {
    
    private String nome;
    private int idade;
    private Seminario47 seminario;

     public Aluno47(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Aluno47() {
    }
    
    public void print(){
                System.out.println("------ Relatório de alunos------");
        System.out.println("Nome: "+this.nome);
        System.out.println("Idade: "+this.idade);
        if(this.seminario != null){
        System.out.println("Seminário "+this.seminario.getTitulo());
        }else{
            System.out.println("Aluno não está inscrito em nenhum seminário.");
        }
        }
    
    public Seminario47 getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario47 seminario) {
        this.seminario = seminario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    
}
