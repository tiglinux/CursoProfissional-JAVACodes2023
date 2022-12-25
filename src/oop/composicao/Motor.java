package oop.composicao;

public class Motor {

    final Carro carro;
    boolean ligado = false;
    double fatorInjecao = 1;

    Motor(Carro carro){
        this.carro = carro;
    }

    int giros(){
        if(!ligado){
            return 0;
        }else{
            return (int)fatorInjecao * 3000;        //Cast para Inteiro
        }
    }
}
