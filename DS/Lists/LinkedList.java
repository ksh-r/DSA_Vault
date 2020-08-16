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