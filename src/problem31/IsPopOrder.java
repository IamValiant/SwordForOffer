package problem31;

import java.util.Stack;

/**
 * Created by Xueyong on 2018/6/9.
 */
public class IsPopOrder {
    public boolean isPopOrder(int[] pushSeq,int[] popSeq){
        if(pushSeq==null || popSeq==null || pushSeq.length==0 || popSeq.length==0
                || pushSeq.length!=popSeq.length){
            return false;
        }
        Stack<Integer> stack = new Stack<Integer>();   //辅助栈
        int popIndex = 0;
        for(int i=0;i<pushSeq.length;i++){
            // 按照入栈序列依次压入辅助栈中
            stack.push(pushSeq[i]);
            // 每入栈一次，就和出栈序列比较，如果栈顶和当前出栈元素相同，则弹出，同时当前弹出元素指针前移；
            // 如果下一个栈顶元素还和当前弹出元素相同，继续弹出
            while(!stack.isEmpty() && stack.peek()==popSeq[popIndex]){
                stack.pop();
                popIndex++;
            }
        }
        // 如果出栈顺序正确，模拟一次进出栈后，辅助栈应该为空。不为空说明序列不正确
        return stack.isEmpty();
    }
}
