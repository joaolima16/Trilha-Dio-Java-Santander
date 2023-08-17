package ExercicioContador;

public class Contador {
    public void contar(int numInical,int numFinal) throws ContadorException{
        while(numInical<=numFinal){
            if(numInical > numFinal){
                throw new ContadorException();
            }
            System.out.println("Numero: " + numInical);
            numInical++;
        }
    }
}
