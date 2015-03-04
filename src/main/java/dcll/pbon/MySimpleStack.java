package dcll.pbon;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.Stack;

/**
 * Created by 21103619 on 04/03/2015.
 *
 * Coucou c'est nous les gars o2
 * On est trop des badass ! wesh rpz le son des playa en direct de la marina
 * Salut Salut
 *
 */
public class MySimpleStack implements SimpleStack {

    private Stack<Item> MyStack = new Stack<Item>();
    public boolean isEmpty() {
        return MyStack.isEmpty();
    }

    @Override
    public int getSize() {
        return MyStack.size();
    }

    @Override
    public void push(Item item) {
        MyStack.push(item);
    }

    @Override
    public Item peek() throws EmptyStackException {
        return MyStack.peek();
    }

    @Override
    public Item pop() throws EmptyStackException {
        return MyStack.pop();
    }
}
