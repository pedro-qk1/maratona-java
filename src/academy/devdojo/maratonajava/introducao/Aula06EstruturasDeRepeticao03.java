package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao03 {
    public static void main(String[] args) {
        // imprima os primeiros 25 numeros de um dado valor. por exemplo, 50
        int valorMax = 50;
        int i = 0;
        while(i <= valorMax) {
            if (i > 25) {
                break;
            }
            System.out.println("i = " + i);
            i++;
        }
    }
}
