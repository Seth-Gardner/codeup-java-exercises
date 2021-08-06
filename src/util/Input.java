package util;
import java.util.Locale;
import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public Input(){
        this.scanner = new Scanner(System.in);
    }

    public String getString(){
        System.out.println("Type Something: ");
        String userString = scanner.nextLine();
        return userString;
    }

    public Boolean yesNo(){
        System.out.println("Select y/n");
        String userAnswer = scanner.nextLine().toLowerCase(Locale.ROOT);
        return userAnswer.equals("y");
    }

    public int getInt(int min, int max){
        System.out.println("Please input an integer");
        int userInt = scanner.nextInt();

        if(userInt < min || userInt > max){
            System.out.println("try again");
            return getInt(min, max);
        }else{
            System.out.println("yep that works");
            return userInt;
        }
    }

    public int getInt(){
        System.out.print("Please inout an integer: ");
        int userInt = scanner.nextInt();
        return userInt;
    }

    public double getDouble(double min, double max){
        System.out.println("Please input a double");
        double userDouble = scanner.nextDouble();

        if(userDouble < min || userDouble > max){
            System.out.println("try again");
            return getDouble(min, max);
        }else{
            System.out.println("yep that works");
            return userDouble;
        }
    }

    public double getDouble(){
        System.out.print("please give me a decimal: ");
        return scanner.nextDouble();
    }

}
