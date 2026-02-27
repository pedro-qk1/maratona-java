package exercicios;

public class exercicioEstruturaCondicional03 {
    public static void main(String[] args) {
        double salario = 150000;
        double imposto = 0;
        double excedente = 0;

        System.out.println("Salário: R$" + salario);
        if(salario <= 25000){
            imposto = salario * ((double)5/100);
            System.out.println("PRIMEIRA FAIXA: Imposto sobre salário: 5% (R$" + imposto + ").");
        } if(salario > 25000 && salario <= 50000){
            excedente = salario - 25000;
            System.out.println("PRIMEIRA FAIXA: Imposto sobre salário: R$25000 paga 5% (R$" + (25000 * ((double) 5 / 100)) + ").");
            System.out.println("SEGUNDA FAIXA: Imposto sobre salário: R$" + excedente + " paga 15% (R$" + (excedente * ((double) 15 / 100)) + ").");
        } if(salario > 50000 && salario <= 100000){
            System.out.println("PRIMEIRA FAIXA: Imposto sobre salário: R$25000 paga 5% (R$" + (25000 * ((double) 5 / 100)) + ").");
            System.out.println("SEGUNDA FAIXA: Imposto sobre salário: R$25000 paga 15% (R$" + (25000 * ((double) 15 / 100)) + ").");
            excedente = salario - 50000;
            System.out.println("TERCEIRA FAIXA: Imposto sobre salário: R$" + excedente + " paga 25% (R$" + (excedente * ((double) 25 / 100)) + ").");
        } if(salario > 100000){
            System.out.println("PRIMEIRA FAIXA: Imposto sobre salário: R$25000 paga 5% (R$" + (25000 * ((double) 5 / 100)) + ").");
            System.out.println("SEGUNDA FAIXA: Imposto sobre salário: R$25000 paga 15% (R$" + (25000 * ((double) 15 / 100)) + ").");
            System.out.println("TERCEIRA FAIXA: Imposto sobre salário: R$50000 paga 25% (R$" + (50000 * ((double) 25 / 100)) + ").");
            excedente = salario - 100000;
            System.out.println("QUARTA FAIXA: Imposto sobre salário: R$" + excedente + " paga 35% (R$" + ((excedente * (double)35 / 100)));
        }
    }
}
