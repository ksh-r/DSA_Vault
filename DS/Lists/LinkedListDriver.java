// This driver produces VS-Code friendly output.

package DS.Lists;

import java.io.IOException;
import java.util.Scanner;

public class LinkedListDriver {
    public static void main(String args[])throws IOException{
        Scanner sc = new Scanner(System.in);
        LinkedList<Object> lListObj = new LinkedList<>();
        System.out.print("\033[H\033[2J");
        boolean flag = true;
        while(flag){
            System.out.printf("Choose operaton :\n\n");
            System.out.printf("\t- 1 add(element, index) - To add an element in the list at specified index.\n");
            System.out.printf("\t- 2 remove(index) - To remove the element in the list at specified index.\n");
            System.out.printf("\t- 3 get(index) - To get the element in the list at specified index.\n");
            System.out.printf("\t- 4 getIndex(element) - To get the the index of first element that matches.\n");
            System.out.printf("\t- 5 isEmpty() - To check if the list is empty.\n");
            System.out.printf("\t- 6 size() - To get the size of the list.\n");
            System.out.printf("\t- 7 print() - To print the Array List.\n\n");
            System.out.print("Enter the choice : ");
            String ch1 = sc.next();
            System.out.printf("\n\n");
            if(ch1.equals("1")){
                System.out.print("Enter the element : ");
                Object element = sc.next();
                System.out.print("Enter the index : ");
                int pos = sc.nextInt();
                lListObj.add(element, pos);
            }
            else if(ch1.equals("2")){
                System.out.print("Enter the index : ");
                int pos = sc.nextInt();
                Object element = lListObj.remove(pos);
                System.out.println("The removed element is " + element);
            }
            else if(ch1.equals("3")){
                System.out.print("Enter the index : ");
                int pos = sc.nextInt();
                Object element = lListObj.get(pos);
                System.out.println("The element is " + element);
            }
            else if(ch1.equals("4")){
                System.out.print("Enter the element : ");
                Object element = sc.next();
                int pos = lListObj.getIndex(element);
                System.out.println("The index is " + pos);
            }
            else if(ch1.equals("5")){
                boolean isEmpty = lListObj.isEmpty();
                System.out.println("Is empty =  " + isEmpty);
            }
            else if(ch1.equals("6")){
                int size = lListObj.size();
                System.out.println("The size of the list is " + size);
            }
            else if(ch1.equals("7")){
                lListObj.print();
            }
            System.out.printf("\n\nDo you want to continue : y / n : ");
            char ch = sc.next().charAt(0);
            if(ch == 'y')
                flag = true;
            else if(ch == 'n')
                flag = false;
            else{
                throw new IllegalArgumentException("Wrong Choice.");
            }
            System.out.print("\033[H\033[2J");
        }
        sc.close();
    }
}