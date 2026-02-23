package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        // imprima todos os numeros pares de 1000000
        int count = 0;
        int countPares = 0;
        while(count <= 1000000){
            if(count % 2 == 0){
                System.out.println(count);
                countPares++;
            }
            count++;
        }
        System.out.println("Quantidade de numeros pares: " + countPares);
        System.out.println("Fim do programa!");
    }
}
