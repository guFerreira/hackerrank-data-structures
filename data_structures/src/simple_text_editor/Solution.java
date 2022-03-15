package simple_text_editor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Solution {

    public static void main(String[] args) {
        // está falhando ainda nos testes 8 e 10
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        try{
            InputStreamReader inputStream = new InputStreamReader(System.in);
            BufferedReader scanner = new BufferedReader(inputStream);

            int qntOperacoes = Integer.parseInt(scanner.readLine());
            String text = "";
            Stack<String> pilha = new Stack<String>();
            pilha.push(text);

            for(int i = 0 ; i < qntOperacoes; i++){
                String linha = scanner.readLine();
                String[] entrada = linha.split(" ");
                switch(entrada[0]){
                    case "1": // concatena a string atual com a anterior
                        text = pilha.peek() + entrada[1];
                        pilha.push(text);
                        break;
                    case "2":

                        text = text.substring(0, text.length() - Integer.parseInt(entrada[1]));
                        pilha.push(text);
                        break;

                    case "3":
                        int valor = Integer.parseInt(entrada[1]) -1;
                        System.out.println(text.charAt(valor));
                        break;
                    case "4":
                        pilha.pop();
                        text = pilha.peek();
                        break;
                }
            }

        }catch (NumberFormatException | IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        /*
        Scanner scanner = new Scanner(System.in);
        int qntOperacoes = scanner.nextInt();
        String text = "";
        Stack<String> pilha = new Stack<String>();
        pilha.push(text);

        for(int i = 0 ; i < qntOperacoes; i++){
            switch(scanner.nextInt()){
                case 1: // concatena a string atual com a anterior
                    text = pilha.peek() + scanner.next();
                    pilha.push(text);
                    break;
                case 2:

                    text = text.substring(0, text.length() - scanner.nextInt());
                    pilha.push(text);
                    break;

                case 3:
                    System.out.println(text.charAt(scanner.nextInt()-1));
                    break;
                case 4:
                    pilha.pop();
                    text = pilha.peek();
                    break;
            }
        }*/
    }
}