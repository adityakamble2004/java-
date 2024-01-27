public class HotelMenu {
    public static void main(String[] args) {
        // Arrays to store product names and prices
        String[] products = {"Burger", "Pizza", "Pasta", "Salad", "Fries"};
        double[] prices = {5.99, 8.99, 7.49, 6.29, 3.49};
        
        // Display the menu
        System.out.println("Hotel Menu:");
        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i] + " :" + prices[i]+" Rs");
        }
    }
}
