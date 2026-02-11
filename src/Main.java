import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String[] arr = { "Apple", "Banana", "Orange" , "berries"};

        String[] reverse = new String[arr.length];

        for (int i = 0; i < arr.length; i++) {

            reverse[i] = arr[arr.length - 1 -i];
            
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(reverse));
    }
}

