public class Swap {
    public static void main(String[] args) {
    String x = "Vodka";
    String y = "Rum";
        System.out.print("the drinks now respectively: "+x); //printing statement without new line
        System.out.println(" and "+y);
    String temp;
    temp = x;
    x=y;
    y=temp;
        System.out.print("the drinks after swappning are: "+x);
        System.out.println(" and "+y);
    }
}
