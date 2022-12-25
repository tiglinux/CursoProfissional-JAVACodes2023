package oop.heranca;

public class Heroi extends Jogador{

    public Heroi(){
        super();                //Chama o construtor da Classe PAI "JOGADOR"
    }

    public boolean atacar(Jogador oponente) {
        boolean ataque1 = super.atacar(oponente);
        boolean ataque2 = super.atacar(oponente);

        return ataque1 || ataque2;
    }

}
