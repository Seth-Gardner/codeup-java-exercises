import java.util.Scanner;
public class MethodsExercises {
    Scanner scanner = new Scanner(System.in);

    public static double Addition(double num1, double num2){
        return num1 + num2;
    }

    public static double Subtraction(double num1, double num2){
        return num1 - num2;
    }

    public static double Multiplication(double num1, double num2){
        double total = 0;

        for (int i = 0; i < num2; i++) {
            total += num1;
        }
        return total;
    }

    public static double Division(double num1, double num2){
        return num1 / num2;
    }

    public static double Modulus(double num1, double num2){
        return num1 % num2;
    }

    public static int GetInteger(int min, int max){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between " + min + " and " + max + ": ");
        int number = scanner.nextInt();
        if(number >= min && number <= max){
            return number;
        }else{return GetInteger(min, max);}
    }
    public static long Factorial(int num){
        long total = 1;
        for (int i = 0; i < num; i++) {
            total *= num - i;
        }
        return total;
    }


    public static void main(String[] args) {
        System.out.println(Addition(500.54, 3.1415926535));
        System.out.println(Subtraction(456, 56));
        System.out.println(Multiplication(5, 5));
        System.out.println(Division(555, 1));
        System.out.println(Modulus(500, 34.33546345));
//        System.out.println(GetInteger(1, 10));
//        System.out.println(Factorial(20));
    }
}
