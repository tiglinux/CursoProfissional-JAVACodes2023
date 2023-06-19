package BasicoJava;

public class VariaveisJava {
    public static void main(String[] args) {
        double  d = 3.14;
        int i = (int) d;

        System.out.printf("O número é : %d",i,"\n"); //Casting

        int x = 11;

        if(x == 10){
            System.out.println("O valor é :" + x);
        }else if(!(x == 10)){
            System.out.println();
            System.out.println("O valor não é 10!");
        }

        int z = 1;

        while(z <= 3){
            if(z == 3){
                System.out.println("Opa! Agora já deu 3 repetições e terminei o programa!");
                break;
            }else{
                if(!(z == 3)){
                    System.out.println("O valor é :"+z);
                }
            }
            z+= 1;
        }

        for (int a= 0; a < 100; a++){
            if(a > 50 && a < 60){
                continue;
            }
            System.out.println(a);
        }
    }
}
