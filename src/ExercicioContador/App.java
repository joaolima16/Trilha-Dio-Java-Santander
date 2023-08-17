package ExercicioContador;

public class App {
    public static void main(String[] args) {
        try{
            Contador  cont = new Contador();
            cont.contar(10, 15);
        }
        catch(ContadorException e){
            System.out.println("Ocorreu um erro executar a função");
        }
        
       
    }
}
