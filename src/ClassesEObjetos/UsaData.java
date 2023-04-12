package ClassesEObjetos;

public class UsaData {
    public static void main(String[] args) {
        Data data1 = new Data();
        System.out.println(data1.dia);

        Data data2 = new Data(14,06,1991);
        System.out.println(data2.getDia());
    }
}
