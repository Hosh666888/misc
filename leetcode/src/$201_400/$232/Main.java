package $201_400.$232;

import java.util.Stack;

/**
 * @author: Double>J
 * @email: zjj20001031@foxmail.com
 * @editTime: 2023/8/11 15:48
 * @desc: 232. 用栈实现队列
 * <p>
 * 请你仅使用两个栈实现先入先出队列。队列应当支持一般队列支持的所有操作（push、pop、peek、empty）：
 * 实现 MyQueue 类：
 * void push(int x) 将元素 x 推到队列的末尾
 * int pop() 从队列的开头移除并返回元素
 * int peek() 返回队列开头的元素
 * boolean empty() 如果队列为空，返回 true ；否则，返回 false
 **/
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    static class MyQueue {
        private final Stack<Integer> stack;
        private final Stack<Integer> outStack;

        public MyQueue() {
            stack = new Stack<>();
            outStack = new Stack<>();
        }

        public void push(int x) {
            stack.push(x);
        }

        public int pop() {
            if (outStack.isEmpty()) {
                while (!stack.isEmpty()) {
                    outStack.push(stack.pop());
                }
            }
            return outStack.pop();
        }

        public int peek() {
            if (outStack.isEmpty()) {
                while (!stack.isEmpty()) {
                    outStack.push(stack.pop());
                }
            }
            return outStack.peek();
        }

        public boolean empty() {
            return stack.isEmpty() && outStack.isEmpty();
        }
    }
}