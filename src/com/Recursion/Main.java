package com.Recursion;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	/*
       Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
       determine if the input string is valid.

      An input string is valid if:
      Open brackets must be closed by the same type of brackets.
      Open brackets must be closed in the correct order.

      Example 1:
      Input: s = "()"

      Output: true
      Example 2:

      Input: s = "()[]{}"
      Output: true
      Example 3:

      Input: s = "(]"
      Output: false
	 */
      String str = "(){}[]";
        System.out.println(valid(str));
    }
    public static boolean valid(String str){
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='(' || str.charAt(i)=='{' || str.charAt(i)=='[')
                stack.add(str.charAt(i));
            else if(str.charAt(i)==')' && (stack.isEmpty() || stack.pop()!='('))
                return false;
            else if(str.charAt(i)=='}' && (stack.isEmpty() || stack.pop()!='{'))
                return false;
            else if(str.charAt(i)==']' && (stack.isEmpty() || stack.pop()!='['))
                return false;
        }
        // At last we will check that the stack is empty or not.
        if(stack.size()>0)
            return false;
        return true;
    }
}
