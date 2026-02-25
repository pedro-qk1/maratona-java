package exercicios;

public class exercicioEstruturaCondicional02 {
    public static void main(String[] args) {
        int primeiroNumero = 110;
        int segundoNumero = 20;
        int terceiroNumero = 45;
        int maiorNumero = terceiroNumero;

        if(primeiroNumero > maiorNumero){
            maiorNumero = primeiroNumero;
        } if(segundoNumero > maiorNumero){
            maiorNumero = segundoNumero;
        } if(terceiroNumero > maiorNumero){
            maiorNumero = terceiroNumero;
        }
        System.out.println("O maior número é: " + maiorNumero);
    }
}
