package practice;

public class Practice {

    public static double multiply(int x, int y){
        return x * y;
    }

    public static double multiply(double x, double y){
        return x * y;
    }

    public static void getMallardDetails(Mallard duck){

        System.out.println("The mallard "+ duck.getName() +" flies at a speed of "+ duck.getFlightSpeed() +" mph.\n");

    }

    public static void main(String[] args) {
//        System.out.println(multiply(2, 4));
//        System.out.println(multiply(3.14, 5.6));
//
//        Mallard hewey = new Mallard("Hewey", 2, 6);
//
//        getMallardDetails(hewey);

        String[] names = {"Rick", "Stacey", "Brad", "Becca"};
        String x;
        try {
            x = names[100];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught!");
            x = "";
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("This will always run.");
        }
    }

}
