package AppControleCandidatos;

import AppControleCandidatos.Entities.ListCandidato;

public class App {
    public static void main(String[] args) {
     ListCandidato listCandidato = new ListCandidato();
     listCandidato.adicionarCandidato("joao", 200.50);
     listCandidato.adicionarCandidato("teste", 550.00);
     listCandidato.adicionarCandidato("Robertin", 2550.00);
     listCandidato.verificarCandidatura();
    }
}
