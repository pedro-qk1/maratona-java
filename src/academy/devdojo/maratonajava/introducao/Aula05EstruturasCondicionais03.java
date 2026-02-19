package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        // doar se salario > 5000
        double salario = 6000;
        String mensagemDoar = "Eu vou doar R$ 500 ao DevDojo!";
        String mensagemNaoDoar = "Ainda nao tenho condições, mas vou ter.";

        // operador ternario => (condição) ? true : false
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;

//        if(salario > 5000) {
//            resultado = mensagemDoar;
//        } else {
//            resultado = mensagemNaoDoar;
//        }

        System.out.println(resultado);
    }
}
