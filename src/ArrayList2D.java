import java.util.ArrayList;

public class ArrayList2D {
    public static void main(String[] args) {

        ArrayList<ArrayList<String>> gamaniList = new ArrayList<>();

        ArrayList<String> bakeryList = new ArrayList<>();
        bakeryList.add("palata");
        bakeryList.add("garlix bread");
        bakeryList.add("donuts");

        ArrayList<String> produceList = new ArrayList<>();
        produceList.add("tomatoes");
        produceList.add("banana");
        produceList.add("orange");

        ArrayList<String> drinksList = new ArrayList<>();
        drinksList.add("Tiger");
        drinksList.add("henniken");
        drinksList.add("tuborg");

        gamaniList.add(bakeryList);
        gamaniList.add(produceList);
        gamaniList.add(drinksList);

        System.out.println(gamaniList);





    }
}
