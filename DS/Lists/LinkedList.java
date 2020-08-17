// This code is written by Keshar Wakharkar.

/* Methods  to use :
 * 1. Default constructor - set default value as null.
 * 2. add(element, index)
 * 3. get(index)
 * 4. remove(index)
 * 5. getIndex(element) - returns the index of first element that matches.
 * 6. isEmpty()
 * 7. size()
 * 8. print()
 */

package DS.Lists;

public class LinkedList<T> {
    LinkedListNode<T> firstnode;
    int size;
    LinkedList()
    {
        firstnode = null;
        size = 0;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public int size(){
        return size;
    }
    public void add(T element, int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Wrong Index.");
        }
        if (index == 0) {
            firstnode = new LinkedListNode<>(element, firstnode);
            /*
             * Creating a new node and passing the address of firstnode to the new node's
             * next's address and changing the reference of firstnode.
             */
        } else {
            LinkedListNode<T> p = firstnode;
            for (int i = 0; i < (index - 1); i++) // Moving up to the node before the index's node.
            {
                p = p.next;
            }
            p.next = new LinkedListNode<>(element, p.next);
            /*
             * Creating a new node whose next contains address of index node and changing
             * the reference of next of node before index node to the new node.
             */
        }
        size++;
    }
    public T remove(int index){
        if(index<0||index>size)
            throw new IndexOutOfBoundsException("Wrong index.");
        T element;
        if(index == 0)
        {
            element = firstnode.data;
            firstnode = firstnode.next;
        }
        else
        {
            LinkedListNode<T> p = firstnode;
            for(int i=0;i<index-1;i++)
            {
                p = p.next;
            }
            element = p.next.data;
            p.next = p.next.next;
        }
        size--;
        return element;
    }
    public T get(int index){
        if(index<0||index>size)
            throw new IndexOutOfBoundsException("Wrong index.");
        LinkedListNode<T> p = firstnode;
        for(int i = 0; i < index; i++){
            p = p.next;
        }
        return p.data;
    }
    public int getIndex(T element){
        LinkedListNode<T> p = firstnode;
        int index = 0;
        while((p != null) && !(p.data.equals(element))){
            p = p.next;
            index++;
        }
        if(p == null)
            return -1;
        else
            return index;
    }
    public void print(){
        LinkedListNode<T> p = firstnode;
        for(int i = 0; i < size; i++){
            System.out.print(p.data + "  ");
            p = p.next;
        }
        System.out.println();
    }
}
class LinkedListNode<T> {
    LinkedListNode<T> next;
    T data;
    LinkedListNode(T data) {
        this.data = data;
    }
    LinkedListNode(T data, LinkedListNode<T> next) {
        this.data = data;
        this.next = next;
    }
}