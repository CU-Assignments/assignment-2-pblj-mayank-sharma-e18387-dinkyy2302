class Book {
    protected String title;
    protected String author;
    protected double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Book Details: Title: " + title + " Author: " + author + " Price: " + price);
    }
}

class Fiction extends Book {
    public Fiction(String title, String author, double price) {
        super(title, author, price);
    }

    @Override
    public void displayDetails() {
        System.out.println("Fiction Book Details: Title: " + title + " Author: " + author + " Price: " + price);
    }
}

class NonFiction extends Book {
    public NonFiction(String title, String author, double price) {
        super(title, author, price);
    }

    @Override
    public void displayDetails() {
        System.out.println("Non-Fiction Book Details: Title: " + title + " Author: " + author + " Price: " + price);
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        Book b1 = new Fiction("Harry Potter", "J.K. Rowling", 500);
        Book b2 = new NonFiction("Sapiens", "Yuval Noah Harari", 700);

        b1.displayDetails();
        b2.displayDetails();
    }
}
