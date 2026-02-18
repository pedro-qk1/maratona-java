package academy.devdojo.maratonajava.introducao;
/*
* Prática
*
* Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:
*
* Eu, <nome>, morando no endereço <endereço>,
* confirmo que recebi o salário de <salário>, na data <data>.
* */
public class Aula03TipoPrimitivoExercicio {
    public static void main(String[] args){
        String nome = "Pedro Victor";
        String endereco = "Rua Edalmo Lima Castro, n° 5 - Coruripe/AL";
        double salario = 7650.78;
        String dataRecebimentoSalario = "18/02/2026";
        String relatorio = "Eu, "+nome+", morando no endereço "+endereco+",\nconfirmo que recebi o salário de R$"+salario+", na data "+dataRecebimentoSalario+".";

        System.out.println(relatorio);
    }
}
