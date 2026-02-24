package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        // valores padroes dentro de um array
        // byte, short, int, long, float e double => 0
        // char => '\u0000' ' '
        // boolean => false
        // String => null

        String[] nomes = new String[4];
        nomes[0] = "Maria";
        nomes[1] = "Pedro";
        nomes[2] = "João";
//        nomes[3] = "Matheus";

        for(int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
