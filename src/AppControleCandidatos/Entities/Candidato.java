package AppControleCandidatos.Entities;

public class Candidato {
    private String nome;
    private double salario;

 
    public Candidato(String nome, double salario) {
        this.salario = salario;
        this.nome = nome;
    }
       public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    

}
