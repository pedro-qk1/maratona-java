package exercicios;

public class exercicioEstruturaCondicional03 {
    public static void main(String[] args) {
        double salario = 200000;
        String impostoUm = "5%";
        String impostoDois = "15%";
        String impostoTres = "25%";
        String impostoQuatro = "35%";

        if(salario <= 25000){
            System.out.println("R$" + salario + " paga " + impostoUm);
        }
        else if(salario > 25000 && salario <= 50000){
            if(salario == 50000){
                System.out.println("R$25000 paga " + impostoUm);
                System.out.println("R$25000 paga " + impostoDois);
                System.out.println("Total de impostos sobre o salário: 20%.");
            } else{
                System.out.println("R$25000 paga " + impostoUm);
                System.out.println("R$" + (salario - 25000) + " paga " + impostoDois);
                System.out.println("Total de impostos sobre o salário: 20%.");
            }
        }
        else if(salario > 50000 && salario <= 100000){
            if(salario == 100000){
                System.out.println("R$25000 paga " + impostoUm);
                System.out.println("R$25000 paga " + impostoDois);
                System.out.println("R$50000 paga " + impostoTres);
                System.out.println("Total de impostos sobre o salário: 45%.");
            } else{
                System.out.println("R$25000 paga " + impostoUm);
                System.out.println("R$25000 paga " + impostoDois);
                System.out.println("R$" + (salario - 50000) + " paga " + impostoTres);
                System.out.println("Total de impostos sobre o salário: 45%.");
            }
        }
        else{
            System.out.println("R$25000 paga " + impostoUm);
            System.out.println("R$25000 paga " + impostoDois);
            System.out.println("R$50000 paga " + impostoTres);
            System.out.println("R$" + (salario - 100000) + " paga " + impostoQuatro);
            System.out.println("Total de impostos sobre o salário: 80%.");
        }
    }
}
