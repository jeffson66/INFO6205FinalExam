import java.util.ArrayList;
import java.util.Stack;

public class RemoveMinParen {
    //time complexity: O(mn) m: number of characters in the string, n:number of remove indices
    //space complexity: O(m)
    public static String remove(String str){
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> remove = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        int index = 0;
        for(char c: str.toCharArray()){
            if(c == '('){
                stack.push(index);
            }else if(c == ')'){
                if(stack.isEmpty()){
                    remove.add(index);
                }else{
                    stack.pop();
                }
            }
            index++;
        }

        while(!stack.isEmpty()){
            remove.add(stack.pop());
        }
        index = 0;
        for(char c: str.toCharArray()){
            if(remove.contains(index)){
                index++;
                continue;
            }else{
                sb.append(c);
                index++;
            }
        }
        return sb.toString();
    }
}

