package advance.java.leetcode.subscription.neetcode.stack;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {
    public static void main(String[] args) {
        GenerateParenthesis generateParenthesis=new GenerateParenthesis();
        System.out.println(generateParenthesis.generateParenthesis(3));
    }
    public List<String> generateParenthesis(int n) {
        List<String> res=new ArrayList<>();
        generate(n,n,"", res);
        return res;
    }
    private static void generate(int leftParRem, int rightParRem, String str, List<String> res){

        if(leftParRem==0 && rightParRem==0){
            res.add(str);
            return;
        }
        if(leftParRem > 0){
            generate(leftParRem-1, rightParRem, str+"(", res);
        }
        if(leftParRem < rightParRem) {
            generate(leftParRem, rightParRem-1, str+")", res);
        }
    }
}
