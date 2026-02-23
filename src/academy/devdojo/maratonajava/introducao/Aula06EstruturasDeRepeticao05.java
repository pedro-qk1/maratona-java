package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao05 {
    public static void main(String[] args) {
        double valorTotal = 30000;
        for (int parcelas = (int)valorTotal; parcelas >= 1; parcelas--) {
            double  valorParcela = valorTotal / parcelas;
            if(valorParcela < 1000){
                continue;
            }
            System.out.println("Parcelas: " + parcelas + " R$ " + valorParcela);
        }
    }
}
