package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        double salarioAnual = 40000.00;
        double porcentagemImposto;
        double valorImposto;

        if (salarioAnual <= 34712.00) {
            porcentagemImposto = 9.70 / 100;
            valorImposto = salarioAnual * porcentagemImposto;
        } else if (salarioAnual <= 68507.00) {
            porcentagemImposto = 37.35 / 100;
            valorImposto = salarioAnual * porcentagemImposto;
        } else {
            porcentagemImposto = 49.50 / 100;
            valorImposto = salarioAnual * porcentagemImposto;
        }
        System.out.println("Você deverá pagar " + porcentagemImposto + "% de imposto sobre seu salário.\n" +
                "Valor total de impostos a ser pago: R$" + valorImposto);
    }
}