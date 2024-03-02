class Book {
    private String authorName;

    public Book(String authorName) {
        this.authorName = authorName;
    }
    public void display_publication() {
        System.out.println("Author: " + authorName);
    }
}

class Book_publication extends Book {
    private String title;
    public Book_publication(String authorName, String title) {
        super(authorName);
        this.title = title;
    }
    @Override
    public void display_publication() {
        super.display_publication();
        System.out.println("Book Title: " + title);
    }
}

class Paper_publication extends Book {
    private String title;

    public Paper_publication(String authorName, String title) {
        super(authorName);
        this.title = title;
    }

    @Override
    public void display_publication() {
        super.display_publication();
        System.out.println("Paper Title: " + title);
    }
}

public class Lab62 {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Enter book or paper");
            return;
        }
        String authorName = args[0];
        String publicationType = args[1];
        String title = args[2];
        Book publication;
        if (publicationType.equalsIgnoreCase("book")) {
            publication = new Book_publication(authorName, title);
        } else if (publicationType.equalsIgnoreCase("paper")) {
            publication = new Paper_publication(authorName, title);
        } else {
            System.out.println("Invalid input");
            return;
        }
        publication.display_publication();
    }
}
