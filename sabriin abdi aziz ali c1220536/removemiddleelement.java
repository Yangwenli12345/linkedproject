

import java.util.LinkedList;

public class removemiddleelement {

    public static void removeMiddleElement(LinkedList<String> list) {

        int middleIndex = list.size() / 2;

        list.remove(middleIndex);
    }

    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();

        names.add("Ahmad");
        names.add("ali");
        names.add("nuur");


        System.out.println("Original LinkedList: " + names);

        removeMiddleElement(names);

        // Output the LinkedList after removing middle element
        System.out.println(" after removing : " + names);

    }



}
