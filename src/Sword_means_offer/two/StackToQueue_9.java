package Sword_means_offer.two;

import java.util.Stack;

public class StackToQueue_9 {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();
    public void  appendTail(int val){
        stack1.add(val);
    }

    public int deleteHead(){
        if (stack1.size() ==0){
            throw  new RuntimeException("invalid operation");
        }else{
            while (stack1.size()!=0){
                int val = stack1.pop();
                stack2.add(val);
            }
            int result = stack2.pop();
            while (stack2.size()!=0){
                int val = stack2.pop();
                stack1.add(val);
            }
            return result;
        }
    }
}
