package collections_examples.list.arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Removing_From_ArrayList {

    public static void main(String[] args) {

        String [] names_of_Girls = {"Joy", "Bose", "Kemi", "Debbie", "Jessica", "Bridget"};
        List<String> list = new ArrayList<>();

        for (String name: names_of_Girls) {
            list.add(name);
        }

        String [] senior_java_gurus = {"Grace_Abayomi", "Chibuzor", "Rabbi", "Steve", "Mofe"};
        List<String> list2 = new ArrayList<>();

        for (String name: senior_java_gurus) {
            list2.add(name);
        }

        System.out.println("ArrayList: ");

        for (int counter = 0; counter < list.size(); counter++) {
            System.out.printf("%s ",list.get(counter) );
        }
        System.out.println();

        for (int counter = 0; counter < list2.size(); counter++) {
            System.out.printf("%s ", list2.get(counter));
        }

        String [] remove_girls_name = {"Bose", "Joy", "Debbie"};
        List<String> removedList = new ArrayList<>();

        for (String girlsName: remove_girls_name) {
            removedList.add(girlsName);
        }

        String [] remove_java_gurus = {"Chibuzor", "Mofe"};
        List<String> removeList = new ArrayList<>();

        for (String java_Gurus : remove_java_gurus) {
            removeList.add(java_Gurus);
        }

        System.out.printf("%n%nArrayList after calling removeMethod %n");

        remove_girls_name(list, removedList);
        remove_java_gurus(list2, removeList);

        for (String name: list) {
            System.out.printf("%s ", name);
        }

        System.out.println();

        for (String name: list2) {
            System.out.printf("%s ", name);
        }

    }


    private static void remove_girls_name(Collection<String> collection1, Collection<String> collection2) {
        Iterator<String> iterator = collection1.iterator();

        while(iterator.hasNext())
            if (collection2.contains(iterator.next())) {
                iterator.remove();
            }
    }
    private static void remove_java_gurus(Collection collectionA, Collection collectionB) {
        Iterator<String> iterator = collectionA.iterator();

        while(iterator.hasNext())
            if (collectionB.contains(iterator.next()))
                iterator.remove();
    }
}
