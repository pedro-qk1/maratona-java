package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / *
        int numero01 = 10;
        double numero02 = 20;
        double resultado = numero01 + numero02;
        System.out.println(numero01 - numero02);
        System.out.println("Valor " + resultado);
        System.out.println("Valor " + numero01 * numero02);
        System.out.println("Valor " + numero01 / numero02);

        // %
        int resto = 20 % 2;
        System.out.println(resto);

        // < > <= >= == !=

        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezDiferenteQueVinte = 10 != 20;
        boolean isDezIgualQueVinte = 10 == 20;
        System.out.println("isDezMaiorQueVinte: " + isDezMaiorQueVinte);
        System.out.println("isDezIgualQueVinte: " + isDezIgualQueVinte);
        System.out.println("isDezMenorQueVinte: " + isDezMenorQueVinte);
        System.out.println("isDezDiferenteQueVinte: " + isDezDiferenteQueVinte);
    }
}
