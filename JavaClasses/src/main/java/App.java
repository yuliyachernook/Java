import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Product> Products = new ArrayList<Product>();

        Products.add(new Product(1, "Cream", 1234584, "Clarins", 1540, 2, 15));
        Products.add(new Product(2, "Powder", 35654634, "Loreal", 1780, 4, 24));
        Products.add(new Product(3, "Mascara", 5464354, "Chanel", 4000, 1, 36));
        Products.add(new Product(4, "Cream", 46574747, "Estee Lauder", 3250, 2, 5));

        String searchName = "Cream";
        System.out.println("Products with name " + searchName);
        for (Product product : Products) {
            if (product.getName() == searchName) {
                System.out.println(product.toString());
            }
        }

        int maxPrice = 2000;
        System.out.println("\nProducts with name: " + searchName + " and cheaper than " + maxPrice);
        for (Product product : Products) {
            if (product.getName() == searchName && product.getPrice() < maxPrice) {
                System.out.println(product.toString());
            }
        }

        int minStorageLife = 2;
        System.out.println("\nProducts with storage life more than " + minStorageLife);
        for (Product product : Products) {
            if (product.getStorageLife() > minStorageLife) {
                System.out.println(product.toString());
            }
        }
    }
}
