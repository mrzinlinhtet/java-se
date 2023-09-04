public class ArrayList {
    public static void main(String[] args) {
        java.util.ArrayList<String> food = new java.util.ArrayList<>();

        food.add("banana");
        food.add("mango");
        food.add("lemon");

        food.set(0,"orange");
        food.remove(2);
        food.clear();


        for (int i = 0; i < food.size(); i++) {
            System.out.println(food.get(i));
        }
    }
}
