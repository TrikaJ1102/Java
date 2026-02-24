import java.util.ArrayList;

public class ArrayListOfBooks {

    public static void main(String[] args) {

        ArrayList<Book> library = new ArrayList<>();

        // Declare outside try so they are visible later
        Book b1 = null;
        Book b2 = null;
        Book b3 = null;
        Book b4 = null;
        Book b5 = null;
        Book b6 = null;

        try {
            b1 = new Book();
            b2 = new Book("LOVE", 700.00, "eert47", "Comedy", "YUGT");
            b3 = new Book(b2);
            b4 = new Book(b1);
            b5 = new Book("Hello", 890.00, "oyuert", "Happy", "PINKK MAN");
            b6 = new Book(" ", 890.00, "oyuert", "Happy", "PINKK MAN"); // will throw InvalidTitleException
        } catch (InvalidPriceException | InvalidTitleException e) {
            System.out.println(e.getMessage());
        }

        // Add only non-null books
        if (b1 != null) library.add(b1);
        if (b2 != null) library.add(b2);
        if (b3 != null) library.add(b3);
        if (b4 != null) library.add(b4);
        if (b5 != null) library.add(b5);
        if (b6 != null) library.add(b6); // b6 will be null if exception thrown

        // Print books
        for (Book b : library) {
            System.out.println("Title: " + b.title +
                    " | Author: " + b.author +
                    " | Price: " + b.price);
        }
    }
}
