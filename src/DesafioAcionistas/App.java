package DesafioAcionistas;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

  public static void main(String[] args) throws ParseException {
    // Lê os dados de Entrada conforme descrito neste Desafio.
    Scanner scanner = new Scanner(System.in);
    String dataInicial = scanner.nextLine();
    String dataFinal = scanner.nextLine();

    SistemaAcionistas sistemaAcionistas = new SistemaAcionistas();
    List < String > analises = sistemaAcionistas.obterAnalisesDesempenho(dataInicial, dataFinal);

    for (String analise: analises) {
      System.out.println(analise);
    }
  }
}

class SistemaAcionistas {
  public List < String > obterAnalisesDesempenho(String dataInicialStr, String dataFinalStr) throws ParseException {
    SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
    Date dataInicial = (Date) df.parse(dataInicialStr);
    Date dataFinal = (Date) df.parse(dataFinalStr);

    // Simula uma base da dados em uma lista de análises:
    List < Analise > analises = new ArrayList < > ();
    analises.add(new Analise((Date) df.parse("01/01/2023"), "Analise de Desempenho Financeiro"));
    analises.add(new Analise((Date) df.parse("15/02/2023"), "Analise de Riscos e Exposicoes"));
    analises.add(new Analise((Date) df.parse("31/03/2023"), "Analises Corporativas"));
    analises.add(new Analise((Date) df.parse("01/04/2023"), "Analise de Politicas e Regulamentacoes"));
    analises.add(new Analise((Date) df.parse("15/05/2023"), "Analise de Ativos"));
    analises.add(new Analise((Date) df.parse("30/06/2023"), "Analise de Inovacao e Tecnologia"));

   //TODO: Implemente o filtro das análises dentro do período especificado. Dica:ltradas e use um loop for para filtrar as análises. Crie uma lista para armazenar as análises fi
    
   // TODO: Retorne a lista de análises filtradas.
   return obterAnalisesDesempenho(dataInicialStr, dataFinalStr);
  }

  class Analise {
    private Date data;
    private String descricao;

    public Analise(Date data, String descricao) {
      this.data = data;
      this.descricao = descricao;
    }


  }
}