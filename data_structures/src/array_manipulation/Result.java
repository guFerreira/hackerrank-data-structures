package array_manipulation;

class Result {

    /*
     * Complete the 'arrayManipulation' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. 2D_INTEGER_ARRAY queries
     */

    public static long arrayManipulation(int n, List<List<Integer>> queries) {
        // Write your code here
        long [] vetor = new long[n+1];
        long maiorValor = 0;

        for(int i = 0; i < queries.size();i++){
            int min = queries.get(i).get(0) -1;
            int max = queries.get(i).get(1);
            long valor = queries.get(i).get(2);

            vetor[max] = vetor[max] - valor;
            vetor[min] = vetor[min] + valor;
        }
        for(int i = 0; i < vetor.length-1; i++){
            vetor[i+1] = vetor[i] + vetor[i+1];
            maiorValor = Math.max(vetor[i+1], maiorValor);
        }



        /*
        solucao nao otimizada que foi recusado em alguns testes
        for(int i = 0; i < queries.size(); i++){
            int min = queries.get(i).get(0) -1;
            int max = queries.get(i).get(1) -1;

            for(int j = min; j <= max; j++){
                vetor[j] += queries.get(i).get(2);
                if(vetor[j] > maiorValor){
                    maiorValor = vetor[j];
                }
            }
            System.out.println(Arrays.toString(vetor));
            /*
            for(int j = 0; j < vetor.length; j++){
                if(j >= min && j <= max){
                    vetor[j] = vetor[j] + queries.get(i).get(2);
                }
                if(vetor[j] > maiorValor){
                    maiorValor = vetor[j];
                }
            }
        }*/


        return maiorValor;

    }

}