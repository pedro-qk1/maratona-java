package exercicios;

public class exercicioEstruturaCondicional01 {
    public static void main(String[] args) {
        double numero = 7;
        boolean menorQueZero = numero < 0;
        boolean maiorQueZero = numero > 0;

        if(menorQueZero){
            System.out.println("O número recebido é NEGATIVO (" + numero + ").");
        } else if(maiorQueZero){
            System.out.println("O número recebido é POSITIVO (" + numero + ").");
        } else{
            System.out.println("O número recebido é ZERO (0).");
        }
    }
}
