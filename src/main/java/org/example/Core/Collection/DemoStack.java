package org.example.Core.Collection;

import java.util.Stack;

public class DemoStack {
    public static void main (String[] args) {

        Stack s = new Stack();
        s.push(50);
        s.push(20);
        s.push(60);
        s.push(70);

        System.out.println(s);
        System.out.println(s.peek()); //to get top element
        System.out.println(s.pop());  //remove top element and return that
        System.out.println(s);

    }

}
