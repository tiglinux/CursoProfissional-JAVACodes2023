package oop.heranca.Desafio;

public class Ferrari extends Carro implements Esportivo,Luxo{

    private boolean ligarTurbo;
    private boolean ligarAr;

    Ferrari(){
        this(315);         //Ele chama o método construtor dessa própria classe
    }
    public Ferrari(int velocidadeMaxima){       //Ele chama o método construtor da classe PAI
        super(velocidadeMaxima);
        setDelta(15);
    }

    @Override
    public void ligarTurbo() {
        ligarTurbo = true;
    }

    @Override
    public void desligarTurbo() {
        ligarTurbo = false;
    }

    @Override
    public void ligarAr() {
        ligarAr = true;
    }

    @Override
    public void desligarAr() {
        ligarAr = false;
    }
}
