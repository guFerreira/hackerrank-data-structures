package arrays_left_rotation;

import java.util.Arrays;
import java.util.List;

class Result {

    /*
     * Complete the 'rotateLeft' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER d
     *  2. INTEGER_ARRAY arr
     */

    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        // Write your code here
        Integer[] aux = new Integer [arr.size()];

        for(int i = 0; i < arr.size();i++){
            int novaPosicao = i - d;
            if(novaPosicao < 0){
                novaPosicao = arr.size() + novaPosicao;
            }
            aux[novaPosicao] = arr.get(i);
        }


        return Arrays.asList(aux);

    }

}