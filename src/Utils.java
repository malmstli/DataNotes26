import java.util.Scanner;

public class Utils {
    public static int getIntInput(String question) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        boolean validInput = false;

        while(!validInput){
            System.out.print(question);
            try{
                number = scanner.nextInt();
                validInput = true;
            } catch (Exception e){
                System.out.println("Fel inmatning, försök igen");
                scanner.nextLine();
            }
        }
        return number;
    }
}
