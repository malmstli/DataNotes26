import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String[] days = { "må", "ti", "on" , "to" , "fr" , "lö" , "sö" };

        int today = 0; // måndag
        int step = 5;
        int newDay = (today + step ) % days.length;

        System.out.printf("I dag är det: %s\n",days[today]);
        System.out.printf("Antal dagar i mellan: %s\n", step);
        System.out.printf("Om fem dagar är det: %s\n", days[newDay]);
    }
}

