package oop.abstrato;

public  class Cachorro extends Mamifero{
    @Override
    public String mover() {
        return "Usando as patas";
    }

    @Override
    public String mamar() {
        return "Mamando.";
    }
}
