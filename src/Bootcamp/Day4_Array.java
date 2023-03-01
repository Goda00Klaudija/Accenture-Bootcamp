import java.util.ArrayList; //Q1
import java.util.*; //Q1

import java.util.Iterator; //Q2
import java.util.List;  //Q2

// 1.Create a new array list, add some colors (string) and print out the collection.
public class Day4_Array {
    public static void main(String[] args) {
        ArrayList<String> colours = new ArrayList<String>();
        colours.add("Purple");
        colours.add("White");
        colours.add("Red");
        System.out.println(colours);

        //2.Iterate through all elements in a array list.
        Iterator i = colours.iterator();
        System.out.println("The ArrayList elements are:");
        while (i.hasNext()) {
            System.out.println(i.next());
        }

        //3.Insert an element into the array list at the first position.
        colours.add(0, "Pink");
        System.out.println(colours);

        //4.Retrieve an element (at a specified index) from a given array list.
        System.out.println(colours.get(3));
        
        //5. Update specific array element by given element.
        colours.set(0,"Blue");
        System.out.println(colours);

    }
}


