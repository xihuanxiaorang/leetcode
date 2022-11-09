package fun.xiaorng.leetcode;

import java.util.Stack;

/**
 * @author liulei
 * @description <p style = " font-weight:bold ; ">有效的括号<p/>
 * @github <a href="https://github.com/xihuanxiaorang/leetcode">leetcode</a>
 * @Copyright 博客：<a href="https://blog.xiaorang.fun">小让的糖果屋</a>  - show me the code
 * @date 2022/11/9 8:37
 */
public class _20_valid_parentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') { // 左字符入栈
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false; // 栈中没有元素，则返回false
                Character top = stack.pop();
                if (top == '(' && c != ')' || top == '{' && c != '}' || top == '[' && c != ']')
                    return false; // 不匹配则返回false
            }
        }
        return stack.isEmpty();
    }

    public boolean isValid2(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(') stack.push(')');
            else if (c == '[') stack.push(']');
            else if (c == '{') stack.push('}');
            else if (stack.isEmpty() || stack.pop() != c) return false;
        }
        return stack.isEmpty();
    }
}
