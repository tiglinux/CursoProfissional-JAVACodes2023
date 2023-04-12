package oop.heranca.teste;

import oop.heranca.Desafio.Carro;
import oop.heranca.Desafio.Civic;
import oop.heranca.Desafio.Ferrari;

public class TestaCarro {
    public static void main(String[] args) {
        Carro civic = new Civic();

        civic.acelerar();
        System.out.println(civic);

        civic.acelerar();
        System.out.println(civic);

        civic.acelerar();
        System.out.println(civic);

        civic.frear();
        System.out.println(civic);


        Ferrari ferrari = new Ferrari(400);
        ferrari.ligarTurbo();
        ferrari.ligarAr();
        ferrari.desligarAr();

        System.out.println(ferrari.velocidadeDoAr());

        ferrari.acelerar();
        System.out.println(ferrari);

        ferrari.acelerar();
        System.out.println(ferrari);

        ferrari.acelerar();
        System.out.println(ferrari);

        ferrari.frear();
        System.out.println(ferrari);

    }
}
