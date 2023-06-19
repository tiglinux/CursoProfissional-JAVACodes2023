package streamsapi;

import java.util.Arrays;
import java.util.List;

public class SemStreams {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        int resultado = 0;

        for(Integer x : lista){
            if(x % 2 == 0){
                resultado += x;
            }
        }
        System.out.println(resultado);
    }
}
