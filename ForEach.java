import java.util.ArrayList;

public class ForEach {
    public static void main(String[] args) {
        //String [] animals = {"Cat","Dog","Horse","Mouse"};

        ArrayList<String> animals = new ArrayList<String>();

        animals.add("Cat");
        animals.add("Dog");
        animals.add("Horse");
        animals.add("Mouse");

        for( String i : animals) //less steps, more readable, less flexible
        {
            System.out.println(i);
        }
    }
}
