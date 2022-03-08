package array_2d_ds;

import java.util.List;

class Result {

    /*
     * Complete the 'hourglassSum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int hourglassSum(List<List<Integer>> arr) {
        // Write your code here
        int maior = -63; // -9x7, o menor valor possível em cada indice da matriz é -9
        // e a ampulheta possuí 7 indíces
        for(int i = 0; i < arr.size()-2; i++){
            for(int j = 0; j < arr.get(0).size()-2; j++){
                int valorAtual = 0;
                //parte superior da ampulheta
                valorAtual = arr.get(i).get(j) +
                        arr.get(i).get(j +1) + arr.get(i).get(j +2);

                //meio da ampulheta
                valorAtual = valorAtual + arr.get(i + 1).get(j + 1);

                //parte inferior da ampulheta
                valorAtual = valorAtual + arr.get(i + 2).get(j) +
                        arr.get(i + 2).get(j + 1) + arr.get(i + 2).get(j +2);

                maior = Math.max(maior, valorAtual);
            }

        }
        return maior;
    }

}