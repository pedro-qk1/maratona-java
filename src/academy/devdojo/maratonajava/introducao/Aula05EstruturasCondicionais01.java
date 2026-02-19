package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 10;
        boolean isAutorizadoComprarBebida = idade >= 18;

        if(isAutorizadoComprarBebida){
            System.out.println("AUTORIZADO a comprar bebida alcoolica.");
        } else {
            System.out.println("NÃO AUTORIZADO a comprar bebida alcoolica.");
        }

        // ! (NOT)
        if(!isAutorizadoComprarBebida){
            System.out.println("NÃO AUTORIZADO a comprar bebida alcoolica.");
        }
    }
}
