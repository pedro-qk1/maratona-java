package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {
    public void somarDoisNumeros(){
        System.out.println(10+10);
    }

    public void subtrairDoisNumeros(){
        System.out.println(10-20);
    }

    public void multiplicarDoisNumeros(int num1, int num2){
        System.out.println(num1 * num2);
    }

    public double divideDoisNumeros(double num1, double num2){
        if(num2 == 0){
            return 0;
        }
        return num1 / num2;
    }

    public double divideDoisNumeros02(double num1, double num2){
        if(num2 == 0){
            return 0;
        } else{
            return num1 / num2;
        }
    }

    public double divideDoisNumeros03(double num1, double num2){
        if(num2 != 0){
            return num1 / num2;
        }
        return 0;
    }

    public void imprimeDivisaoDeDoisNumeros(double num1, double num2){
        if(num2 == 0){
            System.out.println("Não existe divisão por zero (0).");
            return;
        }
        System.out.println(num1 / num2);
    }
}
