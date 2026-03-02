package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.marca = "Toyota";
        carro1.modelo = "Corolla";
        carro1.ano = 2022;

        carro2.marca = "BMW";
        carro2.modelo = "X6";
        carro2.ano = 2025;

        System.out.println("Marca: " + carro1.marca + "\nModelo: " + carro1.modelo + "\nAno: " + carro1.ano);
        System.out.println("=====================");
        System.out.println("Marca: " + carro2.marca + "\nModelo: " + carro2.modelo + "\nAno: " + carro2.ano);
    }
}
