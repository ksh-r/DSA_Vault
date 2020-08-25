//This code is written by Keshar Wakharkar.

/*
 * Methods :
 * 1. isEmpty()
 * 2. size()
 * 2. push(element)
 * 3. pop()
 * 4. peek()
 */

package DS.Lists;

import java.util.EmptyStackException;

public class Stack<T> {
    LinkedList<T> stack;
    public Stack(){
        stack = new LinkedList<>();
    }
    public boolean isEmpty(){
        return stack.size() == 0;
    }
    public int size(){
        return stack.size();
    }
    public void push(T element){
        stack.add(element, stack.size());
    }
    public T pop(){
        if(stack.isEmpty())
            throw new EmptyStackException();
        return stack.remove(stack.size()-1);
    }
    public T peek(){
        if(stack.isEmpty())
            throw new EmptyStackException();
        return stack.get(stack.size()-1);
    }
    public void print(){
        System.out.println("Last in First out format - ");
        for(int i = 0; i < stack.size(); i++){
            System.out.print(stack.get(i) + "  ");
        }
    }
}