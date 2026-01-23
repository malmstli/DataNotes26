import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner myObj = new Scanner(System.in);

        while (true) {
            System.out.println("enter för nytt, q för att avsluta");
            String val = myObj.nextLine();

            if (val.equalsIgnoreCase("q")) {
                System.out.println("avslutas");
                break;
            }

            if (val.isEmpty()) {
                int tal = rand.nextInt(20);
                System.out.println(tal);
            }
        }
    }
}
