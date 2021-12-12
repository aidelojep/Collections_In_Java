package collections_examples.list.arraylist;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class ArrayList_Removal {
    public static void main(String[] args) {
        String [] names_of_movies = {"Spartacus", "Game_Of_Throne", "Merlin"," Legend_Of_The_Seeker", "Prison_Break", "Power", "Empire"};

        List<String> list = new ArrayList<>();

        for (String movie_Names: names_of_movies) {
            list.add(movie_Names);
        }

        String [] remove_movie_names= {"Merlin", "Power", "Empire", "Prison_Break"};
        List<String> removedList = new ArrayList<>();

        for (String updatedNames : remove_movie_names) {

            removedList.add(updatedNames);
        }

        String [] expensive_Cars_2021 = {"Lamborghini", "Toyota", "Benz", "Ferrari", "G-Wagon", "Massarati"};

        List<String> list2 = new ArrayList<>();

        for (String lit_cars_names: expensive_Cars_2021) {
            list2.add(lit_cars_names);
        }

        String [] removedCarList = {"Massarati", "G-Wagon", "Benz"};
        List<String> removeList = new ArrayList<>();

        for (String updatedCarList: removedCarList) {
            removeList.add(updatedCarList);
        }

        System.out.println("ArrayList before method remove");

        for (int counter = 0; counter < list.size(); counter++) {
            System.out.printf("%s ", list.get(counter));
        }

        System.out.println();

        System.out.printf("%nSecond ArrayList before method remove%n");

        for (int counter = 0; counter < list2.size(); counter++) {
            System.out.printf("%s ", list2.get(counter));
        }

        remove_movie_names(list, removedList);
        removedCarList(list2, removeList);

        System.out.println();
        System.out.printf("%nAfter calling Remove method: %n");

        for (String movieName: list) {
            System.out.printf("%s ", movieName);
        }

        System.out.println();

        for (String carName: list2) {
            System.out.printf("%s ", carName);
        }
    }

    private static void remove_movie_names(Collection collection1, Collection collection2) {

        Iterator<String> iterator = collection1.iterator();

        while (iterator.hasNext())
            if (collection2.contains(iterator.next()))
                iterator.remove();
    }

    private static void removedCarList(Collection collectionA, Collection collectionB) {

        Iterator<String> iterator = collectionA.iterator();

        while(iterator.hasNext())
            if(collectionB.contains(iterator.next()))
                iterator.remove();
    }
}
