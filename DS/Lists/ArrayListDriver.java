package DS.Lists;

import java.io.IOException;

public class ArrayListDriver {
    public static void main(String args[])throws IOException{
        ArrayList<String> al = new ArrayList<>();
        System.out.println(al.isEmpty());
        al.add("alps");
        al.add("also", 0);
        al.print();
        System.out.println(al.isEmpty());
        System.out.println(al.size());
        System.out.println(al.remove(0));
        al.print();
    }
}