package game_of_two_stacks;

import java.util.Collections;
import java.util.List;
import java.util.Stack;

class Result {

    /*
     * Complete the 'twoStacks' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER maxSum
     *  2. INTEGER_ARRAY a
     *  3. INTEGER_ARRAY b
     */

    public static int twoStacks(int maxSum, List<Integer> a, List<Integer> b) {
        // Write your code here
        int result = 0;

        Stack<Integer>pilhaA = new Stack<Integer>();
        Stack<Integer> pilhaB = new Stack<Integer>();
        Stack<Integer>pilhaRemovidos = new Stack<Integer>();

        Collections.reverse(a);
        Collections.reverse(b);

        pilhaA.addAll(a);
        pilhaB.addAll(b);

        int totalPilhaRemovidos = 0;

        while(totalPilhaRemovidos <= maxSum){

            if(pilhaA.isEmpty() == false && pilhaB.isEmpty() == false){

                if( pilhaA.peek() >= pilhaB.peek()){

                    totalPilhaRemovidos += pilhaB.peek();
                    pilhaRemovidos.add(pilhaB.pop());

                }else{
                    totalPilhaRemovidos += pilhaA.peek();
                    pilhaRemovidos.add(pilhaA.pop());
                }
            }else{
                if(pilhaA.isEmpty() && pilhaB.isEmpty()){
                    break;
                }
                if(pilhaA.isEmpty()){
                    totalPilhaRemovidos += pilhaB.peek();
                    pilhaRemovidos.add(pilhaB.pop());
                }else if(pilhaB.isEmpty()){
                    totalPilhaRemovidos += pilhaA.peek();
                    pilhaRemovidos.add(pilhaA.pop());
                }


            }
            System.out.println("pilha removidos "+ pilhaRemovidos);
        }

        System.out.println("saiu do loop     "+ totalPilhaRemovidos);
        if(totalPilhaRemovidos > maxSum){
            totalPilhaRemovidos -= pilhaRemovidos.pop();
        }
        result = pilhaRemovidos.size();

        System.out.println(result);
        return result;

    }



}