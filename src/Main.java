public class Main {
    public static void main(String[] args){

        Shirt shirt1 = new Shirt("Nike", "White", 40.0);
        Shirt shirt2 = new Shirt("Adidas", "Black", 50.0);

        System.out.println(shirt1.getBrand());
        System.out.println(shirt1.getColor());
        System.out.println(shirt1.getPrice());

        System.out.println(shirt2.getBrand());
        System.out.println(shirt2.getColor());
        System.out.println(shirt2.getPrice());
    }
}
