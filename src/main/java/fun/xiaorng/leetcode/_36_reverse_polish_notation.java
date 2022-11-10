package fun.xiaorng.leetcode;

import java.util.Stack;

/**
 * @author liulei
 * @description <p style = " font-weight:bold ; ">逆波兰表达式，也叫后缀表达式<p/>
 * @github <a href="https://github.com/xihuanxiaorang/leetcode">leetcode</a>
 * @Copyright 博客：<a href="https://blog.xiaorang.fun">小让的糖果屋</a>  - show me the code
 * @date 2022/11/10 23:51
 */
public class _36_reverse_polish_notation {
    public static void main(String[] args) {
        String[] tokens = {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
        System.out.println(evalRPN(tokens));
    }

    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String token : tokens) {
            if (!("+".equals(token) || "-".equals(token) || "*".equals(token) || "/".equals(token))) {
                stack.push(Integer.valueOf(token));
                continue;
            }
            int num2 = stack.pop();
            int num1 = stack.pop();
            switch (token) {
                case "+":
                    stack.push(num1 + num2);
                    break;
                case "-":
                    stack.push(num1 - num2);
                    break;
                case "*":
                    stack.push(num1 * num2);
                    break;
                case "/":
                    stack.push(num1 / num2);
                    break;
                default:
                    throw new UnsupportedOperationException("不支持的运算符！");
            }
        }
        return stack.pop();
    }
}
