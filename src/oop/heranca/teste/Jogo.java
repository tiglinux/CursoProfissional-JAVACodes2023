package oop.heranca.teste;

import oop.heranca.Direcao;
import oop.heranca.Heroi;
import oop.heranca.Monstro;

public class Jogo {
    public static void main(String[] args) {
        Monstro monstro = new Monstro();
        monstro.x = 10;
        monstro.y = 10;

        Heroi heroi = new Heroi();
        heroi.x = 10;
        heroi.y = 11;

        System.out.println(monstro.vida);
        System.out.println(heroi.vida);

        monstro.atacar(heroi);
        heroi.atacar(monstro);

        monstro.andar(Direcao.NORTE);
        monstro.atacar(heroi);
        heroi.atacar(monstro);


        System.out.printf("A vida de monstro é : %d HP",(monstro.vida));
        System.out.println();
        System.out.printf("A vida de heroí é : %d HP",(heroi.vida));
    }
}

