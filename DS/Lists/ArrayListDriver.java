package DS.Lists;

import java.io.IOException;

public class ArrayListDriver {
    public static void main(String args[])throws IOException{
        ArrayList<Integer> al = new ArrayList<>();
        System.out.println(al.isEmpty());
        al.add(10);
        al.add(20, 0);
        al.print();
        System.out.println(al.isEmpty());
    }
}