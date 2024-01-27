public class LibraryCatalog {
    public static void main(String[] args) {
        // Arrays to store book details
        String[] titles = {"Java Programming", "Head First Java", "Thinking in Java", "Effective Java"};
        String[] authors = {"John Doe", "Kathy Sierra", "Bruce Eckel", "Joshua Bloch"};
        String[] categories = {"Programming", "Programming", "Programming", "Programming"};

        // Display details of Java books
        System.out.println("Java Books:");
        for (int i = 0; i < titles.length; i++) {
            if (categories[i].equals("Programming")) {
                System.out.println("Title: " + titles[i]);
                System.out.println("Author: " + authors[i]);
                System.out.println("Category: " + categories[i]);
                System.out.println();
            }
        }
    }
}
