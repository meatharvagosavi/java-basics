public class MethodOverloading {
    public static void main(String[] args) {

        System.out.println(sum(2,3));
        System.out.println(sum(4,5,60));
        System.out.println(sum(2.3,3.4,4.5,2.3));
    }

    static int sum(int a,int b)
    {
        System.out.println("1st overloading method!");
        return a+b;
    }

    static int sum(int a,int b,int c)
    {
        System.out.println("2nd overloading method!");
        return a+b+c;
    }

    static double sum(double a,double b,double c,double d)
    {
        System.out.println("3rd overloading method!");
        return a+b+c+d;
    }
}
