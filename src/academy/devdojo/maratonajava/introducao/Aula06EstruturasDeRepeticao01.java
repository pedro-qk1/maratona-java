package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        // while, do while, for
        int count = 1;
        while(count <= 10){
            System.out.println(count);
            count++;
        }

        count = 1;

        do{
            System.out.println("Dentro do do-while " + count);
            count++;
        } while(count <= 10);

        for(count = 1; count <= 10; count++){
            System.out.println("Dentro do for " + count);
        }
    }
}
