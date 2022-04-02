package DevDojo;

public class Seminario47 {
    
    private String titulo;
    private Aluno47[] aluno;
    private Professor47 professor;
    private Local47 local;

    public Seminario47(String titulo) {
        this.titulo = titulo;
    }

    public Seminario47() {
    }
    
    public void print(){
                System.out.println("------ Relatório de seminário ------");

        System.out.println("Título: "+this.titulo);
        System.out.println("Professor palestrante: " +this.professor.getNome());
        if(this.local !=null){
        System.out.println("Local, "+this.local.getRua()+ "  Bairro: "+this.local.getBairro());
        }else{
            System.out.println("Nenhum local cadastrado para esse seminário");
        }
        if(aluno!=null && aluno.length!=0){
        System.out.println("==Alunos participantes");
        for(Aluno47 alunos: aluno){
            System.out.println(alunos.getNome());
        }
        return;
    }
        System.out.println("Nenhum aluno cadastrado");
    }
    
    public Local47 getLocal() {
        return local;
    }

    public void setLocal(Local47 local) {
        this.local = local;
    }
    
    
    public Professor47 getProfessor() {
        return professor;
    }
    
    
    public void setProfessor(Professor47 professor) {
        this.professor = professor;
    }

    public Aluno47[] getAluno() {
        return aluno;
    }

    public void setAluno(Aluno47[] aluno) {
        this.aluno = aluno;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    
    
}
