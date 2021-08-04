import java.util.Scanner;
public class StringExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pinkFloyd = "We don't need no education\nWe don't need no thought control";
        System.out.println(pinkFloyd);
        String escape = "Check \"this\" out! \"'s inside of \"'s!";
        System.out.println(escape);
        String backslash = "In Windows, the main drive is usually C:\\";
        System.out.println(backslash);
        String clusters = "I can do backslashes \\, double backslashes \\\\, and the amazing triple backslash \\\\\\";
        System.out.println(clusters);

        boolean stop = false;
        System.out.println("What do you want?");
        do{
            String response = scanner.nextLine();
            if(response.endsWith("?")){
                System.out.println("Sure.");
            }else if(response.endsWith("!")){
                System.out.println("Whoa, chill out!");
            }else if(response.equals("")){
                System.out.println("Fine, be that way");
                System.out.println("Do you even want to talk to me anymore?");
                System.out.print("Y/N: ");
                String leave = scanner.next();
                if(leave.equals("N")){
                    stop = true;
                }
            }else{
                System.out.println("Whatever");
            }


        }while(!stop);
    }
}

