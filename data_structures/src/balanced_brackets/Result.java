package balanced_brackets;

class Result {

    /*
     * Complete the 'isBalanced' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String isBalanced(String s) {
        // Write your code here

        while(s.length() > 0){
            if(s.contains("{}") || s.contains("()") || s.contains("[]")){
                s = s.replace("{}", "");
                s = s.replace("()", "");
                s = s.replace("[]", "");
                System.out.println(s);
            }else{
                break;
            }
        }
        if(s.length() > 0){
            return "NO";
        }
        return "YES";




    }

}
