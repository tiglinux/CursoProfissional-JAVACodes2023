package oop.heranca;

public class Ebook extends Livro{
    private String waterMark;
    private double valor;

    public boolean aplicaDescontoDe(double porcentagem) {
        if(porcentagem > 0.15){
            return false;
        }
        this.valor -= this.valor * porcentagem;
        return true;
    }

    public String getWaterMark() {
        return waterMark;
    }

    public void setWaterMark(String waterMark) {
        this.waterMark = waterMark;
    }
}
