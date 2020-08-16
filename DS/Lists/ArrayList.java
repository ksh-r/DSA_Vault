// This code written by Keshar Wakharkar.

/* Methods:
Default constructor - To build an empty list.
Param constructor - To build list of defined length.
add - To add an element in the list.
add(index, element) - To add an element at the specified index.
remove - To remove an element from the given index.
get - To return an element at specified index.
size - To return the size of the list.
isEmpty - To check if list is empty.
*/

// nearest_filling_index - the index just after the last element's index.

package DS.Lists;

import java.util.Arrays;

public class ArrayList<T> {
    private int nearest_filling_index = 0;
    private Object[] list;
    public ArrayList(){
        list = new Object[10];
    }
    public ArrayList(int n){
        list = new Object[n];
    }
    public boolean isEmpty(){
        return nearest_filling_index == 0 ? true : false;
    }
    public int size(){
        return nearest_filling_index;
    }
    public void add(T element){
        if(nearest_filling_index == list.length)
            list = Arrays.copyOf(list, list.length*2);
        list[nearest_filling_index++] = element;
    }
    public void add(T element, int pos){
        checkPos(pos);
        if(nearest_filling_index == list.length)
            list = Arrays.copyOf(list, list.length*2);
        for(int i = nearest_filling_index-1; i >= pos; i--){
            list[i+1] = list[i];
        }
        list[pos] = element;
        nearest_filling_index++;
    }
    private void checkPos(int pos){
        if(pos < 0)
            throw new IllegalArgumentException("The position of element should be positive.");
        else if(pos > nearest_filling_index)
            throw new IllegalArgumentException("The position of element cannot exceed the size of Array List");
    }
}