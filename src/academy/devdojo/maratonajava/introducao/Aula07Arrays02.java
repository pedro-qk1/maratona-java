package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        // valores padroes dentro de um array
        // byte, short, int, long, float e double => 0
        // char => '\u0000' ' '
        // boolean => false
        // String => null

        String[] nomes = new String[3];
//        idades[0] = 21;
        System.out.println(nomes[0]);
        System.out.println(nomes[1]);
        System.out.println(nomes[2]);
    }
}
