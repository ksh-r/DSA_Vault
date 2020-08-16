// This driver produces VS-Code friendly output.

package DS.Lists;

import java.io.IOException;
import java.util.Scanner;

public class ArrayListDriver {
    public static void main(String args[])throws IOException{
        Scanner sc = new Scanner(System.in);
        ArrayList<Object> aListObj;
        int c1;
        System.out.print("\033[H\033[2J");
        System.out.println("Create a new Array List");
        System.out.printf("\t- 1 with default length.\n\t- 2 with custom length.\n");
        System.out.print("Enter the choice : ");
        c1 = sc.nextInt();
        switch(c1){
            case 1: aListObj = new ArrayList<>();
            break;
            case 2: System.out.printf("\n\n");
            System.out.print("Enter the length : ");
            int length = sc.nextInt();
            aListObj = new ArrayList<>(length);
            break;
            default:
            throw new IllegalArgumentException("Wrong Choice.");
        }
        System.out.print("\033[H\033[2J");
        boolean flag = true;
        while(flag){
            System.out.printf("Choose operaton :\n\n");
            System.out.printf("\t- 1 add(element) - To append an element in the list.\n");
            System.out.printf("\t- 2 add(element, position) - To add an element in the list at specified position.\n");
            System.out.printf("\t- 3 remove(position) - To remove the element in the list at specified position.\n");
            System.out.printf("\t- 4 get(position) - To get the element in the list at specified position.\n");
            System.out.printf("\t- 5 isEmpty() - To check if the list is empty.\n");
            System.out.printf("\t- 6 size() - To get the size of the list.\n");
            System.out.printf("\t- 7 print() - To print the Array List.\n\n");
            System.out.print("Enter the choice : ");
            String ch2 = sc.next();
            System.out.printf("\n\n");
            if(ch2.equals("1")){
                System.out.print("Enter the element : ");
                Object element = sc.next();
                aListObj.add(element);
            }
            else if(ch2.equals("2")){
                System.out.print("Enter the element : ");
                Object element = sc.next();
                System.out.print("Enter the position : ");
                int pos = sc.nextInt();
                aListObj.add(element, pos);
            }
            else if(ch2.equals("3")){
                System.out.print("Enter the position : ");
                int pos = sc.nextInt();
                Object element = aListObj.remove(pos);
                System.out.println("The removed element is " + element);
            }
            else if(ch2.equals("4")){
                System.out.print("Enter the position : ");
                int pos = sc.nextInt();
                Object element = aListObj.get(pos);
                System.out.println("The element is " + element);
            }
            else if(ch2.equals("5")){
                boolean isEmpty = aListObj.isEmpty();
                System.out.println("Is empty =  " + isEmpty);
            }
            else if(ch2.equals("6")){
                int size = aListObj.size();
                System.out.println("The size of the list is " + size);
            }
            else if(ch2.equals("7")){
                aListObj.print();
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