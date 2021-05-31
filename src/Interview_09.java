import java.util.Deque;
import java.util.LinkedList;

/**
 * 用两个栈实现一个队列
 */

public class Interview_09 {

    Deque stack1 = new LinkedList<Integer>();

    Deque stack2 = new LinkedList<Integer>();

    public void appendTail(int value) {
        stack1.push(value);
    }

    public int deleteHead() {
        if(stack2.isEmpty()){
            while(!stack1.isEmpty() ){
                stack2.push(stack1.pop());
            }
        }
        if(stack2.isEmpty()){
            return -1;
        }
        return (int)stack2.pop();
    }

}
