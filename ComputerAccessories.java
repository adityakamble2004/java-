public class ComputerAccessories {
    public static void main(String[] args) {
        // Array of computer accessories
        String[] accessories = {"Keyboard", "Mouse", "Monitor", "Headphones", "Webcam",
                                "Printer", "External Hard Drive", "USB Flash Drive", "Speakers"};

        // Displaying the accessory at the 9th index position
        int index = 8; // Index position (0-based)
        
        // Check if the index is within the array bounds
        if (index >= 0 && index < accessories.length) {
            String accessory = accessories[index];
            System.out.println("The accessory at index " + index + " is: " + accessory);
        } else {
            System.out.println("Invalid index position.");
        }
    }
}
