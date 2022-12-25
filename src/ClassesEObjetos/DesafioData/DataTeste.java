package ClassesEObjetos.DesafioData;

public class DataTeste {
    public static void main(String [] args){
        Data data1 = new Data();
        data1.dia = 14;
        data1.mes = 06;
        data1.ano = 1991;

        System.out.printf("A data é : %d/%d/%d \n",data1.dia,data1.mes,data1.ano);     //Mostra data formatada printf

        Data data2 = new Data();
        data2.dia = 30;
        data2.mes = 10;
        data2.ano = 2002;

        System.out.printf("A data é : %d/%d/%d",data2.dia,data2.mes,data2.ano);
    }
}
