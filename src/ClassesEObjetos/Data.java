package ClassesEObjetos;

public class Data {
    int dia;
    int mes;
    int ano;

    Data(){
        dia = 1;
        mes = 1;
        ano = 1970;
    }

    Data(int dia, int mesInicial, int anoInicial){
        this.dia = dia;
        this.mes = mesInicial;
        this.ano = anoInicial;
    }
}
