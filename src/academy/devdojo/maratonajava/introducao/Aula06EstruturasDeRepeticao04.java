package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    public static void main(String[] args) {
        // dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
        // condição: valorParcela >= 1000
        double valorCarro = 30000;
        double valorParcelas = 0;
        int quantParcelas = 0;

        for (int i = 1; i < valorCarro; i++) {
            valorParcelas = valorCarro / i;
            quantParcelas++;
            if (valorParcelas <= 1000){
                break;
            }
        }
        System.out.println("quant parcelas: " + quantParcelas);
        System.out.println("valor parcelas: " + valorParcelas);
    }
}
