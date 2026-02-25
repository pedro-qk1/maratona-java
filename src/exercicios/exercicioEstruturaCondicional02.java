package exercicios;

public class exercicioEstruturaCondicional02 {
    public static void main(String[] args) {
        int primeiroNumero = -18;
        int segundoNumero = -11;
        int terceiroNumero = -10;
        int maiorNumero = terceiroNumero;

        if(primeiroNumero > maiorNumero){
            maiorNumero = primeiroNumero;
        } else if(segundoNumero > maiorNumero){
            maiorNumero = segundoNumero;
        } else{
            maiorNumero = terceiroNumero;
        }
        System.out.println("O maior número é: " + maiorNumero);
    }
}
