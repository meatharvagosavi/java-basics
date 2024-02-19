import java.util.ArrayList;

public class TwoDarraylist {
    public static void main(String[] args) {

        ArrayList<ArrayList<String>> grocerylist = new ArrayList();

        ArrayList<String> bakerylist = new ArrayList();
        bakerylist.add("Bread");
        bakerylist.add("Cake");
        bakerylist.add("Sweets");

        ArrayList<String> productlist = new ArrayList();
        productlist.add("Zucchini");
        productlist.add("Cauliflower");
        productlist.add("Spinach");

        ArrayList<String> drinklist = new ArrayList();
        drinklist.add("CokeCola");
        drinklist.add("ThumbsUp");

        grocerylist.add(bakerylist);
        grocerylist.add(productlist);
        grocerylist.add(drinklist);

        System.out.println(grocerylist);
    }
}
