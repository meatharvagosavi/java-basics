public class TwoDArray {
    public static void main(String[] args) {

        String [][] cars = new String [3][3];

        cars [0][0] = "mustang";
        cars [0][1] = "BMW";
        cars [0][2] = "swift";
        cars [1][0] = "toyota";
        cars [1][1] = "ferrari";
        cars [1][2] = "porsche";
        cars [2][0] = "nano";
        cars [2][1] = "alto";
        cars [2][2] = "scorpio";

        for (int i=0; i< cars.length; i++)
        {
            System.out.println();
            for (int j=0; j<cars[i].length; j++)
            {
                System.out.print(cars[i][j]+" ");
            }
        }
    }
}
