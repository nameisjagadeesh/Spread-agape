package com.xworkz.data;

import java.util.Stack;

public class BalancedParanthesis {

	public static boolean isBalanced(String s) {
		Stack<Character> stack=new Stack<>() ;
		for(int i=0; i<s.length();i++) {
			char c=s.charAt(i);
			if(c=='('||c=='{'|| c=='[') {
				stack.push(c);
			}
			else if(c==')'||c=='}'|| c==']') {
				if(stack.isEmpty()) {
					return false;
				}
				char top=stack.pop();
				if(!((c==')'&& top=='(') || (c=='}'&&top=='{' )||( c==']' && top=='['))){
					return false; 
				}
			}
		}
		return stack.isEmpty();
	}
	public static void main(String[] args) {
		String s="(([()]))";
		if(isBalanced(s)) {
			System.out.println(s+" is balanced paranthesis");
		}
		else {
			System.out.println(s+" is  not balanced expression ");
		}
	}

}
