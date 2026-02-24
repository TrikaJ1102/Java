public class Book {

    public String title;
    public double price;
    public String ISBN;
    public String genre;
    public String author;

    // Default Constructor
    public Book() {
        title = "Birds of Feather";
        price = 800.00;
        author = "Robert Frost";
        genre = "Poetry";
        ISBN = "YVSFEJNM";
    }

    // Parameterized Constructor
    public Book(String t, double p, String i, String g, String a) 
            throws InvalidPriceException, InvalidTitleException {

        if (t == null || t.trim().isEmpty()) {
            throw new InvalidTitleException("Title cannot be empty");
        }

        if (p < 0) {
            throw new InvalidPriceException("Price cannot be negative");
        }

        title = t;
        price = p;
        ISBN = i;
        genre = g;
        author = a;
    }

    // Copy Constructor
    public Book(Book b) {
        title = b.title;
        price = b.price;
        ISBN = b.ISBN;
        genre = b.genre;
        author = b.author;
    }
}
