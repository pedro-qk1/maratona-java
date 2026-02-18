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

        // && (AND) --- || (OR) --- ! (NOT)

        int idade = 22;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQue30 = idade >= 30 && salario > 4612;
        boolean isDentroDaLeiMenorQue30 = idade < 30 && salario >= 3381;
        System.out.println(isDentroDaLeiMaiorQue30);
        System.out.println(isDentroDaLeiMenorQue30);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlayStationCinco = 5000F;
        boolean isPlayStationCincoCompravel = valorTotalContaCorrente >valorPlayStationCinco || valorTotalContaPoupanca > valorPlayStationCinco;
        System.out.println("isPlayStationCincoCompravel: " + isPlayStationCincoCompravel);
    }
}
