package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        // Utilizando switch, dado os valores de 1 a 7, imprima se é dia útil ou final de semana
        // considerando 1 como domingo
        byte dia = 5;

        /*
        * switch (dia) {
        *   case 1:
        *   case 7:
        *       System.out.println("Fim de semana");
        *       break;
        *   case 2:
        *   case 3:
        *   case 4:
        *   case 5:
        *   case 6:
        *       System.out.println("Dia util");
        *       break;
        *   default:
        *       System.out.println("Opção inválida.");
        *       break;
        * }
        * */
        switch (dia) {
            case 1:
                System.out.println("Domingo (Fim de semana)");
                break;
            case 2:
                System.out.println("Seg (Dia útil)");
                break;
            case 3:
                System.out.println("Ter (Dia útil)");
                break;
            case 4:
                System.out.println("Qua (Dia útil)");
                break;
            case 5:
                System.out.println("Qui (Dia útil)");
                break;
            case 6:
                System.out.println("Sex (Dia útil)");
                break;
            case 7:
                System.out.println("Sab (Dia útil)");
                break;
            default:
                System.out.println("Opção Inválida.");
                break;
        }
        System.out.println("Fim do programa!");
    }
}
