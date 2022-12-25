package oop.heranca.Desafio;

public class Carro {
    final int VELOCIDADE_MAXIMA;
    int velocidadeAtual;

    private int delta;

    public int getDelta() {
        return delta;
    }

    public void setDelta(int delta) {
        this.delta = delta;
    }

    public Carro(int velocidadeMaxima){
        VELOCIDADE_MAXIMA =velocidadeMaxima;
    }

    public void acelerar(){
        if(velocidadeAtual + delta > VELOCIDADE_MAXIMA){
            velocidadeAtual = VELOCIDADE_MAXIMA;
        }else{
            velocidadeAtual+= delta;
        }
    }

    public void frear(){
        if(velocidadeAtual >= 5){
            velocidadeAtual -= 5;
        }else if(velocidadeAtual < 5){
            velocidadeAtual = 0;
        }else if(velocidadeAtual == 0){
            System.out.println("O carro está freado!");
        }
    }

    public String toString(){
        return "Velocidade atual é : "+velocidadeAtual +"KM/h";
    }

}
