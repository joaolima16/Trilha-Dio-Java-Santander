package AppControleCandidatos.Entities;

import java.util.ArrayList;
import java.util.List;

public class ListCandidato {
    private List<Candidato> lsCandidatos;

    public ListCandidato() {
        this.lsCandidatos = new ArrayList<>();
    }

    public void adicionarCandidato(String nome, double salario) {
        this.lsCandidatos.add(new Candidato(nome, salario));
    }

    public void verificarCandidatura() {
        double salarioBase = 2000.0;
        lsCandidatos.forEach(index -> {
            if (index.getSalario() > salarioBase) {
                System.out.println("O candidato: " + index.getNome() + " Está com o acima do padrão");
            } else {
                System.out.println("O candidato: " + index.getNome()+ " Está com o salário no padrão");
            }
        });
    }
}
