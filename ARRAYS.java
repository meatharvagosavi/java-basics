public class ARRAYS {
    public static void main(String[] args) {

        String[] cars = new String[3]; //declaration of array

        cars[0]= "Swift";
        cars[1]= "Verna";
        cars[2]= "Mustang";

        for(int i=0; i<cars.length; i++)
        {
            System.out.println(cars[i]);
        }
    }
}

 /*
 inside psvm {
        another way to declare an array .. array should be at same data type .. string data type for whole array etc.
        String[] cars = {"verna","swift","nano"};
        cars[0] = "mustang";
        System.out.println(cars[0]);
        }
  */
